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
package com.tencentcloudapi.tccatalog.v20241024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTccCatalogsRequest extends AbstractModel {

    /**
    * 数据目录Id
    */
    @SerializedName("CatalogId")
    @Expose
    private String CatalogId;

    /**
    * 数据目录名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据目录类型,当前支持：TCC-HIVE
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 操作人uin
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 数据目录Id 
     * @return CatalogId 数据目录Id
     */
    public String getCatalogId() {
        return this.CatalogId;
    }

    /**
     * Set 数据目录Id
     * @param CatalogId 数据目录Id
     */
    public void setCatalogId(String CatalogId) {
        this.CatalogId = CatalogId;
    }

    /**
     * Get 数据目录名称 
     * @return Name 数据目录名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据目录名称
     * @param Name 数据目录名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据目录类型,当前支持：TCC-HIVE 
     * @return Type 数据目录类型,当前支持：TCC-HIVE
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据目录类型,当前支持：TCC-HIVE
     * @param Type 数据目录类型,当前支持：TCC-HIVE
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5 
     * @return Status 状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5
     * @param Status 状态信息：注册中0，待测试1，连接成功2，连接失败3，删除中4，已删除5
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 操作人uin 
     * @return Operator 操作人uin
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人uin
     * @param Operator 操作人uin
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DescribeTccCatalogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTccCatalogsRequest(DescribeTccCatalogsRequest source) {
        if (source.CatalogId != null) {
            this.CatalogId = new String(source.CatalogId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogId", this.CatalogId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

