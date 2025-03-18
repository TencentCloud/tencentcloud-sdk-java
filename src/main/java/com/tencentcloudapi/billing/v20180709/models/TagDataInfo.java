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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagDataInfo extends AbstractModel {

    /**
    * 分账标签键
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签类型，0普通标签，1分账标签
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设置分账标签时间，普通标签不返回
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 分账标签键 
     * @return TagKey 分账标签键
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 分账标签键
     * @param TagKey 分账标签键
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签类型，0普通标签，1分账标签 
     * @return Status 标签类型，0普通标签，1分账标签
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 标签类型，0普通标签，1分账标签
     * @param Status 标签类型，0普通标签，1分账标签
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设置分账标签时间，普通标签不返回 
     * @return UpdateTime 设置分账标签时间，普通标签不返回
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 设置分账标签时间，普通标签不返回
     * @param UpdateTime 设置分账标签时间，普通标签不返回
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TagDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagDataInfo(TagDataInfo source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

