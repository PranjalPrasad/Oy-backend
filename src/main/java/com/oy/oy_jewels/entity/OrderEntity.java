package com.oy.oy_jewels.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "product_price")
    private BigDecimal productPrice;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "payment_mode")
    private String paymentMode;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "delivery_date")
    private LocalDate deliveryDate;

    @Column(name = "order_date")
    private LocalDate orderDate;

    // Many orders belong to one user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    // Many orders can have one product
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity product;

    // Constructors
    public OrderEntity() {}

    public OrderEntity(Integer quantity, BigDecimal productPrice, BigDecimal totalAmount,
                       String paymentMode, String orderStatus, LocalDate deliveryDate,
                       LocalDate orderDate, UserEntity user, ProductEntity product) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.totalAmount = totalAmount;
        this.paymentMode = paymentMode;
        this.orderStatus = orderStatus;
        this.deliveryDate = deliveryDate;
        this.orderDate = orderDate;
        this.user = user;
        this.product = product;
    }

    // Getters and Setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public BigDecimal getProductPrice() { return productPrice; }
    public void setProductPrice(BigDecimal productPrice) { this.productPrice = productPrice; }

    public BigDecimal getTotalAmount() { return totalAmount; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    public LocalDate getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(LocalDate deliveryDate) { this.deliveryDate = deliveryDate; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public UserEntity getUser() { return user; }
    public void setUser(UserEntity user) { this.user = user; }

    public ProductEntity getProduct() { return product; }
    public void setProduct(ProductEntity product) { this.product = product; }
}


