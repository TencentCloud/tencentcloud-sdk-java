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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginRecord extends AbstractModel{

    /**
    * 记录值
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 当源站配置类型Type=area时，表示区域
当源站类型Type=area时，为空表示默认区域
    */
    @SerializedName("Area")
    @Expose
    private String [] Area;

    /**
    * 当源站配置类型Type=weight时，表示权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 记录ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 是否私有鉴权
当源站类型OriginType=third_part时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Private")
    @Expose
    private Boolean Private;

    /**
    * 私有鉴权参数
当源站类型Private=true时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateParameter")
    @Expose
    private OriginRecordPrivateParameter [] PrivateParameter;

    /**
     * Get 记录值 
     * @return Record 记录值
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 记录值
     * @param Record 记录值
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 当源站配置类型Type=area时，表示区域
当源站类型Type=area时，为空表示默认区域 
     * @return Area 当源站配置类型Type=area时，表示区域
当源站类型Type=area时，为空表示默认区域
     */
    public String [] getArea() {
        return this.Area;
    }

    /**
     * Set 当源站配置类型Type=area时，表示区域
当源站类型Type=area时，为空表示默认区域
     * @param Area 当源站配置类型Type=area时，表示区域
当源站类型Type=area时，为空表示默认区域
     */
    public void setArea(String [] Area) {
        this.Area = Area;
    }

    /**
     * Get 当源站配置类型Type=weight时，表示权重 
     * @return Weight 当源站配置类型Type=weight时，表示权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 当源站配置类型Type=weight时，表示权重
     * @param Weight 当源站配置类型Type=weight时，表示权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 记录ID 
     * @return RecordId 记录ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录ID
     * @param RecordId 记录ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 是否私有鉴权
当源站类型OriginType=third_part时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Private 是否私有鉴权
当源站类型OriginType=third_part时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPrivate() {
        return this.Private;
    }

    /**
     * Set 是否私有鉴权
当源站类型OriginType=third_part时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Private 是否私有鉴权
当源站类型OriginType=third_part时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivate(Boolean Private) {
        this.Private = Private;
    }

    /**
     * Get 私有鉴权参数
当源站类型Private=true时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateParameter 私有鉴权参数
当源站类型Private=true时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginRecordPrivateParameter [] getPrivateParameter() {
        return this.PrivateParameter;
    }

    /**
     * Set 私有鉴权参数
当源站类型Private=true时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateParameter 私有鉴权参数
当源站类型Private=true时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateParameter(OriginRecordPrivateParameter [] PrivateParameter) {
        this.PrivateParameter = PrivateParameter;
    }

    public OriginRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecord(OriginRecord source) {
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.Area != null) {
            this.Area = new String[source.Area.length];
            for (int i = 0; i < source.Area.length; i++) {
                this.Area[i] = new String(source.Area[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Private != null) {
            this.Private = new Boolean(source.Private);
        }
        if (source.PrivateParameter != null) {
            this.PrivateParameter = new OriginRecordPrivateParameter[source.PrivateParameter.length];
            for (int i = 0; i < source.PrivateParameter.length; i++) {
                this.PrivateParameter[i] = new OriginRecordPrivateParameter(source.PrivateParameter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamArraySimple(map, prefix + "Area.", this.Area);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Private", this.Private);
        this.setParamArrayObj(map, prefix + "PrivateParameter.", this.PrivateParameter);

    }
}

