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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StepInfo extends AbstractModel {

    /**
    * 步骤id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 步骤名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 步骤状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 类型(text/expand)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 总结
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 步骤扩展结构
    */
    @SerializedName("Expand")
    @Expose
    private StepExpand Expand;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 步骤id 
     * @return Id 步骤id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 步骤id
     * @param Id 步骤id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 步骤名称 
     * @return Name 步骤名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 步骤名称
     * @param Name 步骤名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 步骤状态 
     * @return Status 步骤状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 步骤状态
     * @param Status 步骤状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 类型(text/expand) 
     * @return Type 类型(text/expand)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型(text/expand)
     * @param Type 类型(text/expand)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 总结 
     * @return Summary 总结
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 总结
     * @param Summary 总结
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 步骤扩展结构 
     * @return Expand 步骤扩展结构
     */
    public StepExpand getExpand() {
        return this.Expand;
    }

    /**
     * Set 步骤扩展结构
     * @param Expand 步骤扩展结构
     */
    public void setExpand(StepExpand Expand) {
        this.Expand = Expand;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public StepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StepInfo(StepInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Expand != null) {
            this.Expand = new StepExpand(source.Expand);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamObj(map, prefix + "Expand.", this.Expand);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

