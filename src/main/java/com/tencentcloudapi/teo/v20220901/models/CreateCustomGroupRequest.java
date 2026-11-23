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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomGroupRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>自定义组名称。</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>自定义组类型。创建后不可修改，不同类型的自定义组支持的条目类型不同。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组，支持 JA3、JA4 类型的条目</li><li>UA： UA 组，支持 UA 类型的条目</li><li>Referer： Referer 组，支持 Referer 类型的条目</li></ul>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>自定义组条目列表。</p>
    */
    @SerializedName("GroupItems")
    @Expose
    private CustomGroupItem [] GroupItems;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>自定义组名称。</p> 
     * @return GroupName <p>自定义组名称。</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>自定义组名称。</p>
     * @param GroupName <p>自定义组名称。</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>自定义组类型。创建后不可修改，不同类型的自定义组支持的条目类型不同。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组，支持 JA3、JA4 类型的条目</li><li>UA： UA 组，支持 UA 类型的条目</li><li>Referer： Referer 组，支持 Referer 类型的条目</li></ul> 
     * @return GroupType <p>自定义组类型。创建后不可修改，不同类型的自定义组支持的条目类型不同。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组，支持 JA3、JA4 类型的条目</li><li>UA： UA 组，支持 UA 类型的条目</li><li>Referer： Referer 组，支持 Referer 类型的条目</li></ul>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>自定义组类型。创建后不可修改，不同类型的自定义组支持的条目类型不同。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组，支持 JA3、JA4 类型的条目</li><li>UA： UA 组，支持 UA 类型的条目</li><li>Referer： Referer 组，支持 Referer 类型的条目</li></ul>
     * @param GroupType <p>自定义组类型。创建后不可修改，不同类型的自定义组支持的条目类型不同。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组，支持 JA3、JA4 类型的条目</li><li>UA： UA 组，支持 UA 类型的条目</li><li>Referer： Referer 组，支持 Referer 类型的条目</li></ul>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>自定义组条目列表。</p> 
     * @return GroupItems <p>自定义组条目列表。</p>
     */
    public CustomGroupItem [] getGroupItems() {
        return this.GroupItems;
    }

    /**
     * Set <p>自定义组条目列表。</p>
     * @param GroupItems <p>自定义组条目列表。</p>
     */
    public void setGroupItems(CustomGroupItem [] GroupItems) {
        this.GroupItems = GroupItems;
    }

    public CreateCustomGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomGroupRequest(CreateCustomGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupItems != null) {
            this.GroupItems = new CustomGroupItem[source.GroupItems.length];
            for (int i = 0; i < source.GroupItems.length; i++) {
                this.GroupItems[i] = new CustomGroupItem(source.GroupItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArrayObj(map, prefix + "GroupItems.", this.GroupItems);

    }
}

