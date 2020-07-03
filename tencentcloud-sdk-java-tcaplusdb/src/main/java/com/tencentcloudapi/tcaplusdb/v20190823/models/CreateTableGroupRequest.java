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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTableGroupRequest extends AbstractModel{

    /**
    * 表格组所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 表格组名称，可以采用中文、英文或数字字符，最大长度32个字符
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * 表格组ID，可以由用户指定，但在同一个集群内不能重复，如果不指定则采用自增的模式
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格组标签列表
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoUnit [] ResourceTags;

    /**
     * Get 表格组所属集群ID 
     * @return ClusterId 表格组所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表格组所属集群ID
     * @param ClusterId 表格组所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 表格组名称，可以采用中文、英文或数字字符，最大长度32个字符 
     * @return TableGroupName 表格组名称，可以采用中文、英文或数字字符，最大长度32个字符
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set 表格组名称，可以采用中文、英文或数字字符，最大长度32个字符
     * @param TableGroupName 表格组名称，可以采用中文、英文或数字字符，最大长度32个字符
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get 表格组ID，可以由用户指定，但在同一个集群内不能重复，如果不指定则采用自增的模式 
     * @return TableGroupId 表格组ID，可以由用户指定，但在同一个集群内不能重复，如果不指定则采用自增的模式
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格组ID，可以由用户指定，但在同一个集群内不能重复，如果不指定则采用自增的模式
     * @param TableGroupId 表格组ID，可以由用户指定，但在同一个集群内不能重复，如果不指定则采用自增的模式
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表格组标签列表 
     * @return ResourceTags 表格组标签列表
     */
    public TagInfoUnit [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 表格组标签列表
     * @param ResourceTags 表格组标签列表
     */
    public void setResourceTags(TagInfoUnit [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

