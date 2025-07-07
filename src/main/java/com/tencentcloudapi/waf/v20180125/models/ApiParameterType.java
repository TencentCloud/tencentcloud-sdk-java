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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiParameterType extends AbstractModel {

    /**
    * 参数名称
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * 参数类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 参数位置
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 数据标签(敏感字段)
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 来源是请求或者响应
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 是否需要泛化 ，0表示不需要，1表示需要
    */
    @SerializedName("IsPan")
    @Expose
    private Long IsPan;

    /**
    * 是否鉴权，1表示是，0表示否
    */
    @SerializedName("IsAuth")
    @Expose
    private Long IsAuth;

    /**
     * Get 参数名称 
     * @return ParameterName 参数名称
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set 参数名称
     * @param ParameterName 参数名称
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get 参数类型 
     * @return Type 参数类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数类型
     * @param Type 参数类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 参数位置 
     * @return Location 参数位置
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 参数位置
     * @param Location 参数位置
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 数据标签(敏感字段) 
     * @return Label 数据标签(敏感字段)
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set 数据标签(敏感字段)
     * @param Label 数据标签(敏感字段)
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    /**
     * Get 时间戳 
     * @return Timestamp 时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳
     * @param Timestamp 时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 来源是请求或者响应 
     * @return Source 来源是请求或者响应
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源是请求或者响应
     * @param Source 来源是请求或者响应
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 是否需要泛化 ，0表示不需要，1表示需要 
     * @return IsPan 是否需要泛化 ，0表示不需要，1表示需要
     */
    public Long getIsPan() {
        return this.IsPan;
    }

    /**
     * Set 是否需要泛化 ，0表示不需要，1表示需要
     * @param IsPan 是否需要泛化 ，0表示不需要，1表示需要
     */
    public void setIsPan(Long IsPan) {
        this.IsPan = IsPan;
    }

    /**
     * Get 是否鉴权，1表示是，0表示否 
     * @return IsAuth 是否鉴权，1表示是，0表示否
     */
    public Long getIsAuth() {
        return this.IsAuth;
    }

    /**
     * Set 是否鉴权，1表示是，0表示否
     * @param IsAuth 是否鉴权，1表示是，0表示否
     */
    public void setIsAuth(Long IsAuth) {
        this.IsAuth = IsAuth;
    }

    public ApiParameterType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiParameterType(ApiParameterType source) {
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.IsPan != null) {
            this.IsPan = new Long(source.IsPan);
        }
        if (source.IsAuth != null) {
            this.IsAuth = new Long(source.IsAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArraySimple(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "IsPan", this.IsPan);
        this.setParamSimple(map, prefix + "IsAuth", this.IsAuth);

    }
}

