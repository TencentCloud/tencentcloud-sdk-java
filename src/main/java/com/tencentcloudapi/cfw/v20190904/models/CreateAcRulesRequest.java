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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAcRulesRequest extends AbstractModel{

    /**
    * 创建规则数据
    */
    @SerializedName("Data")
    @Expose
    private RuleInfoData [] Data;

    /**
    * 0：添加（默认），1：插入
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 边id
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 访问控制规则状态
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 0：添加，1：覆盖
    */
    @SerializedName("Overwrite")
    @Expose
    private Long Overwrite;

    /**
    * NAT实例ID, 参数Area存在的时候这个必传
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * portScan: 来自于端口扫描, patchImport: 来自于批量导入
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * NAT地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 创建规则数据 
     * @return Data 创建规则数据
     */
    public RuleInfoData [] getData() {
        return this.Data;
    }

    /**
     * Set 创建规则数据
     * @param Data 创建规则数据
     */
    public void setData(RuleInfoData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 0：添加（默认），1：插入 
     * @return Type 0：添加（默认），1：插入
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0：添加（默认），1：插入
     * @param Type 0：添加（默认），1：插入
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 边id 
     * @return EdgeId 边id
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 边id
     * @param EdgeId 边id
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 访问控制规则状态 
     * @return Enable 访问控制规则状态
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 访问控制规则状态
     * @param Enable 访问控制规则状态
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 0：添加，1：覆盖 
     * @return Overwrite 0：添加，1：覆盖
     */
    public Long getOverwrite() {
        return this.Overwrite;
    }

    /**
     * Set 0：添加，1：覆盖
     * @param Overwrite 0：添加，1：覆盖
     */
    public void setOverwrite(Long Overwrite) {
        this.Overwrite = Overwrite;
    }

    /**
     * Get NAT实例ID, 参数Area存在的时候这个必传 
     * @return InstanceId NAT实例ID, 参数Area存在的时候这个必传
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set NAT实例ID, 参数Area存在的时候这个必传
     * @param InstanceId NAT实例ID, 参数Area存在的时候这个必传
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get portScan: 来自于端口扫描, patchImport: 来自于批量导入 
     * @return From portScan: 来自于端口扫描, patchImport: 来自于批量导入
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set portScan: 来自于端口扫描, patchImport: 来自于批量导入
     * @param From portScan: 来自于端口扫描, patchImport: 来自于批量导入
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get NAT地域 
     * @return Area NAT地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT地域
     * @param Area NAT地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public CreateAcRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAcRulesRequest(CreateAcRulesRequest source) {
        if (source.Data != null) {
            this.Data = new RuleInfoData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new RuleInfoData(source.Data[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Overwrite != null) {
            this.Overwrite = new Long(source.Overwrite);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Overwrite", this.Overwrite);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

