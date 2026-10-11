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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagValueInfo extends AbstractModel {

    /**
    * 标签值ID
    */
    @SerializedName("TagValueId")
    @Expose
    private String TagValueId;

    /**
    * 标签值内容，查询时填充，写入时不传
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 标签来源，参考 web_enum_standard.proto -> TagSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有，查询时填充，写入时不传
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 继承来源的用户组名称列表，Source=1 时为空，查询时填充，写入时不传
    */
    @SerializedName("GroupNames")
    @Expose
    private String [] GroupNames;

    /**
     * Get 标签值ID 
     * @return TagValueId 标签值ID
     */
    public String getTagValueId() {
        return this.TagValueId;
    }

    /**
     * Set 标签值ID
     * @param TagValueId 标签值ID
     */
    public void setTagValueId(String TagValueId) {
        this.TagValueId = TagValueId;
    }

    /**
     * Get 标签值内容，查询时填充，写入时不传 
     * @return TagValue 标签值内容，查询时填充，写入时不传
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值内容，查询时填充，写入时不传
     * @param TagValue 标签值内容，查询时填充，写入时不传
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 标签来源，参考 web_enum_standard.proto -> TagSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有，查询时填充，写入时不传 
     * @return Source 标签来源，参考 web_enum_standard.proto -> TagSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有，查询时填充，写入时不传
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 标签来源，参考 web_enum_standard.proto -> TagSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有，查询时填充，写入时不传
     * @param Source 标签来源，参考 web_enum_standard.proto -> TagSource：0=未指定 1=用户直绑 2=用户组继承 3=两者都有，查询时填充，写入时不传
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 继承来源的用户组名称列表，Source=1 时为空，查询时填充，写入时不传 
     * @return GroupNames 继承来源的用户组名称列表，Source=1 时为空，查询时填充，写入时不传
     */
    public String [] getGroupNames() {
        return this.GroupNames;
    }

    /**
     * Set 继承来源的用户组名称列表，Source=1 时为空，查询时填充，写入时不传
     * @param GroupNames 继承来源的用户组名称列表，Source=1 时为空，查询时填充，写入时不传
     */
    public void setGroupNames(String [] GroupNames) {
        this.GroupNames = GroupNames;
    }

    public TagValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagValueInfo(TagValueInfo source) {
        if (source.TagValueId != null) {
            this.TagValueId = new String(source.TagValueId);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.GroupNames != null) {
            this.GroupNames = new String[source.GroupNames.length];
            for (int i = 0; i < source.GroupNames.length; i++) {
                this.GroupNames[i] = new String(source.GroupNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagValueId", this.TagValueId);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupNames.", this.GroupNames);

    }
}

