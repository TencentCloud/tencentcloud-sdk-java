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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineTag extends AbstractModel {

    /**
    * 关联标签ID
    */
    @SerializedName("Rid")
    @Expose
    private Long Rid;

    /**
    * 标签名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签ID
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
     * Get 关联标签ID 
     * @return Rid 关联标签ID
     */
    public Long getRid() {
        return this.Rid;
    }

    /**
     * Set 关联标签ID
     * @param Rid 关联标签ID
     */
    public void setRid(Long Rid) {
        this.Rid = Rid;
    }

    /**
     * Get 标签名 
     * @return Name 标签名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名
     * @param Name 标签名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签ID 
     * @return TagId 标签ID
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set 标签ID
     * @param TagId 标签ID
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    public MachineTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineTag(MachineTag source) {
        if (source.Rid != null) {
            this.Rid = new Long(source.Rid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TagId != null) {
            this.TagId = new Long(source.TagId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rid", this.Rid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TagId", this.TagId);

    }
}

