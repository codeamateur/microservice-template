package com.zjx.dev.template.order.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel("订单信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    @ApiModelProperty("主键ID")
    private Integer id;

    @ApiModelProperty("商品名称")
    private String commodityName;

    @ApiModelProperty("商品单价")
    private BigDecimal unitPrice;

    @ApiModelProperty("商品数量")
    private Integer quantity;

    @ApiModelProperty("采购时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale = "zh" , timezone="GMT+8")
    private Date purchaseDate;
}
