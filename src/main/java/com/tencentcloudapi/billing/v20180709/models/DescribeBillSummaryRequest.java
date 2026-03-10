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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryRequest extends AbstractModel {

    /**
    * <p>账单月份，格式为2023-04</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>账单维度类型，枚举值如下：business、project、region、payMode、tag</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>标签键，GroupType=tag获取标签维度账单时传</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String [] TagKey;

    /**
    * <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
     * Get <p>账单月份，格式为2023-04</p> 
     * @return Month <p>账单月份，格式为2023-04</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>账单月份，格式为2023-04</p>
     * @param Month <p>账单月份，格式为2023-04</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>账单维度类型，枚举值如下：business、project、region、payMode、tag</p> 
     * @return GroupType <p>账单维度类型，枚举值如下：business、project、region、payMode、tag</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>账单维度类型，枚举值如下：business、project、region、payMode、tag</p>
     * @param GroupType <p>账单维度类型，枚举值如下：business、project、region、payMode、tag</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>标签键，GroupType=tag获取标签维度账单时传</p> 
     * @return TagKey <p>标签键，GroupType=tag获取标签维度账单时传</p>
     */
    public String [] getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>标签键，GroupType=tag获取标签维度账单时传</p>
     * @param TagKey <p>标签键，GroupType=tag获取标签维度账单时传</p>
     */
    public void setTagKey(String [] TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p> 
     * @return OperateUin <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     * @param OperateUin <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p> 
     * @return PayerUin <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
     * @param PayerUin <p>支付者的账号 ID（账号 ID 是用户在腾讯云的唯一账号标识），默认查询本账号账单，如集团管理账号需查询成员账号自付的账单，该字段需入参成员账号UIN</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    public DescribeBillSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryRequest(DescribeBillSummaryRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.TagKey != null) {
            this.TagKey = new String[source.TagKey.length];
            for (int i = 0; i < source.TagKey.length; i++) {
                this.TagKey[i] = new String(source.TagKey[i]);
            }
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "TagKey.", this.TagKey);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);

    }
}

