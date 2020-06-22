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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DictInfo extends AbstractModel{

    /**
    * 自定义词库ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 自定义词库名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义词库创建时间，形式为:yyyy-mm-dd hh:mm:ss。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 自定义词库描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 自定义词库修改时间，形式为:yyyy-mm-dd hh:mm:ss。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 自定义词库ID。 
     * @return Id 自定义词库ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 自定义词库ID。
     * @param Id 自定义词库ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 自定义词库名称。 
     * @return Name 自定义词库名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义词库名称。
     * @param Name 自定义词库名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义词库创建时间，形式为:yyyy-mm-dd hh:mm:ss。 
     * @return CreateTime 自定义词库创建时间，形式为:yyyy-mm-dd hh:mm:ss。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 自定义词库创建时间，形式为:yyyy-mm-dd hh:mm:ss。
     * @param CreateTime 自定义词库创建时间，形式为:yyyy-mm-dd hh:mm:ss。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 自定义词库描述信息。 
     * @return Description 自定义词库描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 自定义词库描述信息。
     * @param Description 自定义词库描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 自定义词库修改时间，形式为:yyyy-mm-dd hh:mm:ss。 
     * @return UpdateTime 自定义词库修改时间，形式为:yyyy-mm-dd hh:mm:ss。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 自定义词库修改时间，形式为:yyyy-mm-dd hh:mm:ss。
     * @param UpdateTime 自定义词库修改时间，形式为:yyyy-mm-dd hh:mm:ss。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

