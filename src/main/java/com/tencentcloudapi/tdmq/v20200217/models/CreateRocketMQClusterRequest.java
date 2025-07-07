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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQClusterRequest extends AbstractModel {

    /**
    * 集群名称，3-64个字符，只能包含字母、数字、“-”及“_”
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集群描述，128个字符以内
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 集群名称，3-64个字符，只能包含字母、数字、“-”及“_” 
     * @return Name 集群名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群名称，3-64个字符，只能包含字母、数字、“-”及“_”
     * @param Name 集群名称，3-64个字符，只能包含字母、数字、“-”及“_”
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集群描述，128个字符以内 
     * @return Remark 集群描述，128个字符以内
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 集群描述，128个字符以内
     * @param Remark 集群描述，128个字符以内
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 标签列表 
     * @return TagList 标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签列表
     * @param TagList 标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateRocketMQClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQClusterRequest(CreateRocketMQClusterRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

