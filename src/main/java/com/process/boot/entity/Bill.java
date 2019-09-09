package com.process.boot.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xkx
 * @description
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "leaf_bill")
public class Bill {

  /**
   * 账单id
   */
  private Long id;

  /**
   * 账单编号
   */
  private String billNo;

  /**
   * 账单金额
   */
  private BigDecimal amount;

  /**
   * 用户
   */
  private Long personId;

  /**
   * 账单备注
   */
  private String remark;

  /**
   * 创建时间
   */
  private Date createDate;


}
