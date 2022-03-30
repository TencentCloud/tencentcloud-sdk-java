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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeDracoNodeInfo extends AbstractModel{

    /**
    * 节点ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否已激活
    */
    @SerializedName("IsUsed")
    @Expose
    private Boolean IsUsed;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 备注信息，如批次
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * SN 设备号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
     * Get 节点ID 
     * @return Id 节点ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 节点ID
     * @param Id 节点ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 节点名称 
     * @return Name 节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名称
     * @param Name 节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否已激活 
     * @return IsUsed 是否已激活
     */
    public Boolean getIsUsed() {
        return this.IsUsed;
    }

    /**
     * Set 是否已激活
     * @param IsUsed 是否已激活
     */
    public void setIsUsed(Boolean IsUsed) {
        this.IsUsed = IsUsed;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 备注信息，如批次 
     * @return Remark 备注信息，如批次
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，如批次
     * @param Remark 备注信息，如批次
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get SN 设备号 
     * @return SN SN 设备号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set SN 设备号
     * @param SN SN 设备号
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    public EdgeDracoNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeDracoNodeInfo(EdgeDracoNodeInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsUsed != null) {
            this.IsUsed = new Boolean(source.IsUsed);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsUsed", this.IsUsed);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SN", this.SN);

    }
}

