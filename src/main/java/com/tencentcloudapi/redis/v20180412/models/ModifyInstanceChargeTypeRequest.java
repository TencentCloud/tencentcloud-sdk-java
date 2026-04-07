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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceChargeTypeRequest extends AbstractModel {

    /**
    * <p>实例ID数组</p><p>入参限制：批量操作数组长度不超过20</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>修改计费模式的操作类型</p><p>枚举值：</p><ul><li>PREPAID： 按量计费转包年包月</li><li>POSTPAID： 包年包月转按量计费</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>购买时长，仅当InstanceChargeType=PREPAID时需要传</p><p>取值范围：[1, 36]</p><p>单位：月</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get <p>实例ID数组</p><p>入参限制：批量操作数组长度不超过20</p> 
     * @return InstanceIds <p>实例ID数组</p><p>入参限制：批量操作数组长度不超过20</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例ID数组</p><p>入参限制：批量操作数组长度不超过20</p>
     * @param InstanceIds <p>实例ID数组</p><p>入参限制：批量操作数组长度不超过20</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>修改计费模式的操作类型</p><p>枚举值：</p><ul><li>PREPAID： 按量计费转包年包月</li><li>POSTPAID： 包年包月转按量计费</li></ul> 
     * @return InstanceChargeType <p>修改计费模式的操作类型</p><p>枚举值：</p><ul><li>PREPAID： 按量计费转包年包月</li><li>POSTPAID： 包年包月转按量计费</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>修改计费模式的操作类型</p><p>枚举值：</p><ul><li>PREPAID： 按量计费转包年包月</li><li>POSTPAID： 包年包月转按量计费</li></ul>
     * @param InstanceChargeType <p>修改计费模式的操作类型</p><p>枚举值：</p><ul><li>PREPAID： 按量计费转包年包月</li><li>POSTPAID： 包年包月转按量计费</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>购买时长，仅当InstanceChargeType=PREPAID时需要传</p><p>取值范围：[1, 36]</p><p>单位：月</p> 
     * @return Period <p>购买时长，仅当InstanceChargeType=PREPAID时需要传</p><p>取值范围：[1, 36]</p><p>单位：月</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，仅当InstanceChargeType=PREPAID时需要传</p><p>取值范围：[1, 36]</p><p>单位：月</p>
     * @param Period <p>购买时长，仅当InstanceChargeType=PREPAID时需要传</p><p>取值范围：[1, 36]</p><p>单位：月</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public ModifyInstanceChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceChargeTypeRequest(ModifyInstanceChargeTypeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

