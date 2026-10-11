/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRuleOperator extends AbstractModel {

    /**
    * <p>规则名</p><p>枚举值：</p><ul><li>CREATION_TIME_DAYS： 创建时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CREATION_TIME &gt; 5，指的是创建时间-今天大于5天，即5天前（以及更早）创建的文件</li><li>CHANGE_TIME_DAYS： 元数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CHANGE_TIME &gt; 5，指的是元数据修改时间-今天大于5天，即5天前以及更早修改元数据的文件</li><li>MODIFICATION_TIME_DAYS： 数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 MODIFICATION_TIME &gt; 5，指的是数据修改时间-今天大于5天，即5天前（以及更早）修改的文件</li><li>ACCESS_TIME_DAYS： 访问时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 ACCESS_TIME &gt; 5，指的是访问时间-今天大于5天，即5天前（以及更早）访问的文件</li><li>CREATION_TIME_DATE： 创建时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CREATION_TIME &gt; 2026-06-01，指的是创建时间晚于2026年6月1日</li><li>CHANGE_TIME_DATE： 元数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CHANGE_TIME &gt; 2026-06-01，指的是元数据修改晚于2026年6月1日</li><li>MODIFICATION_TIME_DATE： 数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 MODIFICATION_TIME &gt; 2026-06-01，指的是数据修改时间晚于2026年6月1日</li><li>ACCESS_TIME_DATE： 访问时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 ACCESS_TIME &gt; 2026-06-01，指的是访问时间晚于2026年6月1日</li><li>FILE_SIZE： 文件大小，数字，单位byte，整数，0 ～ 64位整数最大值</li></ul>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>比较关系</p><p>枚举值：</p><ul><li>&gt;：  大于</li><li>&gt;=： 大于等于</li><li>=： 相等</li><li>&lt;： 小于</li><li>&lt;=： 小于等于</li></ul>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>比较值</p><p>如果Key是CREATION_TIME_DAYS、CHANGE_TIME_DAYS、MODIFICATION_TIME_DAYS、ACCESS_TIME_DAYS时，值是整数；<br>如果Key是CREATION_TIME_DATE、CHANGE_TIME_DATE、MODIFICATION_TIME_DATE、ACCESS_TIME_DATE时，值是日期，格式是YYYY-MM-DD；<br>如果Key是FILE_SIZE，值是整数，单位是byte</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>规则名</p><p>枚举值：</p><ul><li>CREATION_TIME_DAYS： 创建时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CREATION_TIME &gt; 5，指的是创建时间-今天大于5天，即5天前（以及更早）创建的文件</li><li>CHANGE_TIME_DAYS： 元数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CHANGE_TIME &gt; 5，指的是元数据修改时间-今天大于5天，即5天前以及更早修改元数据的文件</li><li>MODIFICATION_TIME_DAYS： 数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 MODIFICATION_TIME &gt; 5，指的是数据修改时间-今天大于5天，即5天前（以及更早）修改的文件</li><li>ACCESS_TIME_DAYS： 访问时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 ACCESS_TIME &gt; 5，指的是访问时间-今天大于5天，即5天前（以及更早）访问的文件</li><li>CREATION_TIME_DATE： 创建时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CREATION_TIME &gt; 2026-06-01，指的是创建时间晚于2026年6月1日</li><li>CHANGE_TIME_DATE： 元数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CHANGE_TIME &gt; 2026-06-01，指的是元数据修改晚于2026年6月1日</li><li>MODIFICATION_TIME_DATE： 数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 MODIFICATION_TIME &gt; 2026-06-01，指的是数据修改时间晚于2026年6月1日</li><li>ACCESS_TIME_DATE： 访问时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 ACCESS_TIME &gt; 2026-06-01，指的是访问时间晚于2026年6月1日</li><li>FILE_SIZE： 文件大小，数字，单位byte，整数，0 ～ 64位整数最大值</li></ul> 
     * @return Key <p>规则名</p><p>枚举值：</p><ul><li>CREATION_TIME_DAYS： 创建时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CREATION_TIME &gt; 5，指的是创建时间-今天大于5天，即5天前（以及更早）创建的文件</li><li>CHANGE_TIME_DAYS： 元数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CHANGE_TIME &gt; 5，指的是元数据修改时间-今天大于5天，即5天前以及更早修改元数据的文件</li><li>MODIFICATION_TIME_DAYS： 数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 MODIFICATION_TIME &gt; 5，指的是数据修改时间-今天大于5天，即5天前（以及更早）修改的文件</li><li>ACCESS_TIME_DAYS： 访问时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 ACCESS_TIME &gt; 5，指的是访问时间-今天大于5天，即5天前（以及更早）访问的文件</li><li>CREATION_TIME_DATE： 创建时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CREATION_TIME &gt; 2026-06-01，指的是创建时间晚于2026年6月1日</li><li>CHANGE_TIME_DATE： 元数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CHANGE_TIME &gt; 2026-06-01，指的是元数据修改晚于2026年6月1日</li><li>MODIFICATION_TIME_DATE： 数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 MODIFICATION_TIME &gt; 2026-06-01，指的是数据修改时间晚于2026年6月1日</li><li>ACCESS_TIME_DATE： 访问时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 ACCESS_TIME &gt; 2026-06-01，指的是访问时间晚于2026年6月1日</li><li>FILE_SIZE： 文件大小，数字，单位byte，整数，0 ～ 64位整数最大值</li></ul>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>规则名</p><p>枚举值：</p><ul><li>CREATION_TIME_DAYS： 创建时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CREATION_TIME &gt; 5，指的是创建时间-今天大于5天，即5天前（以及更早）创建的文件</li><li>CHANGE_TIME_DAYS： 元数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CHANGE_TIME &gt; 5，指的是元数据修改时间-今天大于5天，即5天前以及更早修改元数据的文件</li><li>MODIFICATION_TIME_DAYS： 数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 MODIFICATION_TIME &gt; 5，指的是数据修改时间-今天大于5天，即5天前（以及更早）修改的文件</li><li>ACCESS_TIME_DAYS： 访问时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 ACCESS_TIME &gt; 5，指的是访问时间-今天大于5天，即5天前（以及更早）访问的文件</li><li>CREATION_TIME_DATE： 创建时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CREATION_TIME &gt; 2026-06-01，指的是创建时间晚于2026年6月1日</li><li>CHANGE_TIME_DATE： 元数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CHANGE_TIME &gt; 2026-06-01，指的是元数据修改晚于2026年6月1日</li><li>MODIFICATION_TIME_DATE： 数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 MODIFICATION_TIME &gt; 2026-06-01，指的是数据修改时间晚于2026年6月1日</li><li>ACCESS_TIME_DATE： 访问时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 ACCESS_TIME &gt; 2026-06-01，指的是访问时间晚于2026年6月1日</li><li>FILE_SIZE： 文件大小，数字，单位byte，整数，0 ～ 64位整数最大值</li></ul>
     * @param Key <p>规则名</p><p>枚举值：</p><ul><li>CREATION_TIME_DAYS： 创建时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CREATION_TIME &gt; 5，指的是创建时间-今天大于5天，即5天前（以及更早）创建的文件</li><li>CHANGE_TIME_DAYS： 元数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 CHANGE_TIME &gt; 5，指的是元数据修改时间-今天大于5天，即5天前以及更早修改元数据的文件</li><li>MODIFICATION_TIME_DAYS： 数据修改时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 MODIFICATION_TIME &gt; 5，指的是数据修改时间-今天大于5天，即5天前（以及更早）修改的文件</li><li>ACCESS_TIME_DAYS： 访问时间，比较的value 是days，数字整数。判断条件均为与“今天”相差。例如 ACCESS_TIME &gt; 5，指的是访问时间-今天大于5天，即5天前（以及更早）访问的文件</li><li>CREATION_TIME_DATE： 创建时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CREATION_TIME &gt; 2026-06-01，指的是创建时间晚于2026年6月1日</li><li>CHANGE_TIME_DATE： 元数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 CHANGE_TIME &gt; 2026-06-01，指的是元数据修改晚于2026年6月1日</li><li>MODIFICATION_TIME_DATE： 数据修改时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 MODIFICATION_TIME &gt; 2026-06-01，指的是数据修改时间晚于2026年6月1日</li><li>ACCESS_TIME_DATE： 访问时间，比较的value 是date,日期，格式为YYYY-MM-DD。判断条件均为与value对应的日期的对比。例如 ACCESS_TIME &gt; 2026-06-01，指的是访问时间晚于2026年6月1日</li><li>FILE_SIZE： 文件大小，数字，单位byte，整数，0 ～ 64位整数最大值</li></ul>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>比较关系</p><p>枚举值：</p><ul><li>&gt;：  大于</li><li>&gt;=： 大于等于</li><li>=： 相等</li><li>&lt;： 小于</li><li>&lt;=： 小于等于</li></ul> 
     * @return Operator <p>比较关系</p><p>枚举值：</p><ul><li>&gt;：  大于</li><li>&gt;=： 大于等于</li><li>=： 相等</li><li>&lt;： 小于</li><li>&lt;=： 小于等于</li></ul>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>比较关系</p><p>枚举值：</p><ul><li>&gt;：  大于</li><li>&gt;=： 大于等于</li><li>=： 相等</li><li>&lt;： 小于</li><li>&lt;=： 小于等于</li></ul>
     * @param Operator <p>比较关系</p><p>枚举值：</p><ul><li>&gt;：  大于</li><li>&gt;=： 大于等于</li><li>=： 相等</li><li>&lt;： 小于</li><li>&lt;=： 小于等于</li></ul>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>比较值</p><p>如果Key是CREATION_TIME_DAYS、CHANGE_TIME_DAYS、MODIFICATION_TIME_DAYS、ACCESS_TIME_DAYS时，值是整数；<br>如果Key是CREATION_TIME_DATE、CHANGE_TIME_DATE、MODIFICATION_TIME_DATE、ACCESS_TIME_DATE时，值是日期，格式是YYYY-MM-DD；<br>如果Key是FILE_SIZE，值是整数，单位是byte</p> 
     * @return Value <p>比较值</p><p>如果Key是CREATION_TIME_DAYS、CHANGE_TIME_DAYS、MODIFICATION_TIME_DAYS、ACCESS_TIME_DAYS时，值是整数；<br>如果Key是CREATION_TIME_DATE、CHANGE_TIME_DATE、MODIFICATION_TIME_DATE、ACCESS_TIME_DATE时，值是日期，格式是YYYY-MM-DD；<br>如果Key是FILE_SIZE，值是整数，单位是byte</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>比较值</p><p>如果Key是CREATION_TIME_DAYS、CHANGE_TIME_DAYS、MODIFICATION_TIME_DAYS、ACCESS_TIME_DAYS时，值是整数；<br>如果Key是CREATION_TIME_DATE、CHANGE_TIME_DATE、MODIFICATION_TIME_DATE、ACCESS_TIME_DATE时，值是日期，格式是YYYY-MM-DD；<br>如果Key是FILE_SIZE，值是整数，单位是byte</p>
     * @param Value <p>比较值</p><p>如果Key是CREATION_TIME_DAYS、CHANGE_TIME_DAYS、MODIFICATION_TIME_DAYS、ACCESS_TIME_DAYS时，值是整数；<br>如果Key是CREATION_TIME_DATE、CHANGE_TIME_DATE、MODIFICATION_TIME_DATE、ACCESS_TIME_DATE时，值是日期，格式是YYYY-MM-DD；<br>如果Key是FILE_SIZE，值是整数，单位是byte</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public PolicyRuleOperator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRuleOperator(PolicyRuleOperator source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

