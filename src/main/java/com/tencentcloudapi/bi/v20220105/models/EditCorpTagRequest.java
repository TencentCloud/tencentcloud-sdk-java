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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditCorpTagRequest extends AbstractModel {

    /**
    * 标签ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 标签名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 导入标签的模式(manual/auto)
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * 自动导入标签表的id
    */
    @SerializedName("AutoImportTagTableId")
    @Expose
    private Long AutoImportTagTableId;

    /**
    * 自动导入标签的关联字段
    */
    @SerializedName("AutoImportField")
    @Expose
    private String AutoImportField;

    /**
    * 是否异步请求
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * 自动导入标签表的表名
    */
    @SerializedName("AutoImportTagTableName")
    @Expose
    private String AutoImportTagTableName;

    /**
    * 事务id
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
     * Get 标签ID 
     * @return Id 标签ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 标签ID
     * @param Id 标签ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 标签名称 
     * @return Name 标签名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名称
     * @param Name 标签名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 导入标签的模式(manual/auto) 
     * @return ImportType 导入标签的模式(manual/auto)
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set 导入标签的模式(manual/auto)
     * @param ImportType 导入标签的模式(manual/auto)
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get 自动导入标签表的id 
     * @return AutoImportTagTableId 自动导入标签表的id
     */
    public Long getAutoImportTagTableId() {
        return this.AutoImportTagTableId;
    }

    /**
     * Set 自动导入标签表的id
     * @param AutoImportTagTableId 自动导入标签表的id
     */
    public void setAutoImportTagTableId(Long AutoImportTagTableId) {
        this.AutoImportTagTableId = AutoImportTagTableId;
    }

    /**
     * Get 自动导入标签的关联字段 
     * @return AutoImportField 自动导入标签的关联字段
     */
    public String getAutoImportField() {
        return this.AutoImportField;
    }

    /**
     * Set 自动导入标签的关联字段
     * @param AutoImportField 自动导入标签的关联字段
     */
    public void setAutoImportField(String AutoImportField) {
        this.AutoImportField = AutoImportField;
    }

    /**
     * Get 是否异步请求 
     * @return AsyncRequest 是否异步请求
     */
    public Boolean getAsyncRequest() {
        return this.AsyncRequest;
    }

    /**
     * Set 是否异步请求
     * @param AsyncRequest 是否异步请求
     */
    public void setAsyncRequest(Boolean AsyncRequest) {
        this.AsyncRequest = AsyncRequest;
    }

    /**
     * Get 自动导入标签表的表名 
     * @return AutoImportTagTableName 自动导入标签表的表名
     */
    public String getAutoImportTagTableName() {
        return this.AutoImportTagTableName;
    }

    /**
     * Set 自动导入标签表的表名
     * @param AutoImportTagTableName 自动导入标签表的表名
     */
    public void setAutoImportTagTableName(String AutoImportTagTableName) {
        this.AutoImportTagTableName = AutoImportTagTableName;
    }

    /**
     * Get 事务id 
     * @return TranId 事务id
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 事务id
     * @param TranId 事务id
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    public EditCorpTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditCorpTagRequest(EditCorpTagRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.AutoImportTagTableId != null) {
            this.AutoImportTagTableId = new Long(source.AutoImportTagTableId);
        }
        if (source.AutoImportField != null) {
            this.AutoImportField = new String(source.AutoImportField);
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.AutoImportTagTableName != null) {
            this.AutoImportTagTableName = new String(source.AutoImportTagTableName);
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "AutoImportTagTableId", this.AutoImportTagTableId);
        this.setParamSimple(map, prefix + "AutoImportField", this.AutoImportField);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "AutoImportTagTableName", this.AutoImportTagTableName);
        this.setParamSimple(map, prefix + "TranId", this.TranId);

    }
}

