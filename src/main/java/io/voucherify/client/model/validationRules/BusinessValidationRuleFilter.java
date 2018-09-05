package io.voucherify.client.model.validationRules;

import io.voucherify.client.utils.AbstractFilter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class BusinessValidationRuleFilter extends AbstractFilter<String, Object> {

  private Integer limit;

  private Integer page;

  @Override
  protected Map<String, Object> getMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("limit", limit);
    map.put("page", page);

    return map;
  }
}
