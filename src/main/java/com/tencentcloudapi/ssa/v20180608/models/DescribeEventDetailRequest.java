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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventDetailRequest extends AbstractModel{

    /**
    * 事件索引名
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 事件id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 事件来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 事件子类型
    */
    @SerializedName("SubEventType")
    @Expose
    private Long SubEventType;

    /**
    * 事件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 事件索引名 
     * @return Index 事件索引名
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 事件索引名
     * @param Index 事件索引名
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 事件id 
     * @return Id 事件id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 事件id
     * @param Id 事件id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 事件来源 
     * @return Source 事件来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 事件来源
     * @param Source 事件来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 事件子类型 
     * @return SubEventType 事件子类型
     */
    public Long getSubEventType() {
        return this.SubEventType;
    }

    /**
     * Set 事件子类型
     * @param SubEventType 事件子类型
     */
    public void setSubEventType(Long SubEventType) {
        this.SubEventType = SubEventType;
    }

    /**
     * Get 事件名称 
     * @return Name 事件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名称
     * @param Name 事件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeEventDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventDetailRequest(DescribeEventDetailRequest source) {
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.SubEventType != null) {
            this.SubEventType = new Long(source.SubEventType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SubEventType", this.SubEventType);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

