/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPStrategy extends AbstractModel{

    /**
    * 策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 用户自定义策略名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * IP列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyData")
    @Expose
    private String StrategyData;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 策略绑定的API数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindApiTotalCount")
    @Expose
    private Long BindApiTotalCount;

    /**
    * 绑定的API详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindApis")
    @Expose
    private DesApisStatus [] BindApis;

    /**
     * Get 策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyId 策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyId 策略唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 用户自定义策略名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyName 用户自定义策略名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 用户自定义策略名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyName 用户自定义策略名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyType 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyType 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get IP列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyData IP列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyData() {
        return this.StrategyData;
    }

    /**
     * Set IP列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyData IP列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyData(String StrategyData) {
        this.StrategyData = StrategyData;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 修改时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 策略绑定的API数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindApiTotalCount 策略绑定的API数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindApiTotalCount() {
        return this.BindApiTotalCount;
    }

    /**
     * Set 策略绑定的API数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindApiTotalCount 策略绑定的API数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindApiTotalCount(Long BindApiTotalCount) {
        this.BindApiTotalCount = BindApiTotalCount;
    }

    /**
     * Get 绑定的API详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindApis 绑定的API详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DesApisStatus [] getBindApis() {
        return this.BindApis;
    }

    /**
     * Set 绑定的API详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindApis 绑定的API详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindApis(DesApisStatus [] BindApis) {
        this.BindApis = BindApis;
    }

    public IPStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPStrategy(IPStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyData != null) {
            this.StrategyData = new String(source.StrategyData);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.BindApiTotalCount != null) {
            this.BindApiTotalCount = new Long(source.BindApiTotalCount);
        }
        if (source.BindApis != null) {
            this.BindApis = new DesApisStatus[source.BindApis.length];
            for (int i = 0; i < source.BindApis.length; i++) {
                this.BindApis[i] = new DesApisStatus(source.BindApis[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyData", this.StrategyData);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "BindApiTotalCount", this.BindApiTotalCount);
        this.setParamArrayObj(map, prefix + "BindApis.", this.BindApis);

    }
}

