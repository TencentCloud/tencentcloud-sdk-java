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

public class CustomGroup extends AbstractModel {

    /**
    * <p>自定义组的唯一标识 ID。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>自定义组名称。</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>自定义组类型。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组</li><li>UA： UA 组</li><li>Referer： Referer 组</li></ul>
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
    * <p>自定义组条目总数量。</p>
    */
    @SerializedName("GroupItemTotalCount")
    @Expose
    private Long GroupItemTotalCount;

    /**
    * <p>自定义组被引用的次数。</p>
    */
    @SerializedName("RefCount")
    @Expose
    private Long RefCount;

    /**
     * Get <p>自定义组的唯一标识 ID。</p> 
     * @return GroupId <p>自定义组的唯一标识 ID。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>自定义组的唯一标识 ID。</p>
     * @param GroupId <p>自定义组的唯一标识 ID。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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
     * Get <p>自定义组类型。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组</li><li>UA： UA 组</li><li>Referer： Referer 组</li></ul> 
     * @return GroupType <p>自定义组类型。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组</li><li>UA： UA 组</li><li>Referer： Referer 组</li></ul>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>自定义组类型。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组</li><li>UA： UA 组</li><li>Referer： Referer 组</li></ul>
     * @param GroupType <p>自定义组类型。</p><p>枚举值：</p><ul><li>TLSFingerprint： TLS 指纹组</li><li>UA： UA 组</li><li>Referer： Referer 组</li></ul>
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

    /**
     * Get <p>自定义组条目总数量。</p> 
     * @return GroupItemTotalCount <p>自定义组条目总数量。</p>
     */
    public Long getGroupItemTotalCount() {
        return this.GroupItemTotalCount;
    }

    /**
     * Set <p>自定义组条目总数量。</p>
     * @param GroupItemTotalCount <p>自定义组条目总数量。</p>
     */
    public void setGroupItemTotalCount(Long GroupItemTotalCount) {
        this.GroupItemTotalCount = GroupItemTotalCount;
    }

    /**
     * Get <p>自定义组被引用的次数。</p> 
     * @return RefCount <p>自定义组被引用的次数。</p>
     */
    public Long getRefCount() {
        return this.RefCount;
    }

    /**
     * Set <p>自定义组被引用的次数。</p>
     * @param RefCount <p>自定义组被引用的次数。</p>
     */
    public void setRefCount(Long RefCount) {
        this.RefCount = RefCount;
    }

    public CustomGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGroup(CustomGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
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
        if (source.GroupItemTotalCount != null) {
            this.GroupItemTotalCount = new Long(source.GroupItemTotalCount);
        }
        if (source.RefCount != null) {
            this.RefCount = new Long(source.RefCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArrayObj(map, prefix + "GroupItems.", this.GroupItems);
        this.setParamSimple(map, prefix + "GroupItemTotalCount", this.GroupItemTotalCount);
        this.setParamSimple(map, prefix + "RefCount", this.RefCount);

    }
}

