package poly.edu.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import poly.edu.Dao.OrderDAO;
import poly.edu.Dao.OrderDetailDAO;
import poly.edu.entity.Order;
import poly.edu.entity.OrderDetail;
import poly.edu.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDAO dao;
	@Autowired
	OrderDetailDAO ddao;
	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();
		Order order = mapper.convertValue(orderData, Order.class);
		dao.save(order);

		// đọ json list orderdtail
		TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>() {
		};
		List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"), type).stream()
				.peek(d -> d.setOrder(order)).collect(Collectors.toList());
		ddao.saveAll(details);

		return order;
	}
	

	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}


	@Override
	public List<Order> findByIdUsername(String username) {

		return dao.findByIdUsername(username);
	}

}
