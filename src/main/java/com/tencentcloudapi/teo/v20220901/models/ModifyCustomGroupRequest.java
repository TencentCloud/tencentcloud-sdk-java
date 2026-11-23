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

public class ModifyCustomGroupRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>自定义组唯一标识 ID。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>自定义组名称。该字段不填时则保留原值。</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>指定本次对 GroupItems 的更新方式。</p><p>枚举值：</p><ul><li>Replace： 使用 GroupItems 全量替换原有条目列表</li><li>Append： 追加 GroupItems 到组条目列表中</li><li>Remove： 从原有条目列表中移除与 GroupItems 中 Content 和 ItemType 均相同的条目。若指定条目不存在，则忽略该条目</li></ul><p>默认值：Replace</p>
    */
    @SerializedName("GroupItemOperation")
    @Expose
    private String GroupItemOperation;

    /**
    * <p>自定义组条目列表。该字段不填时则保留原值。</p>
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
     * Get <p>自定义组唯一标识 ID。</p> 
     * @return GroupId <p>自定义组唯一标识 ID。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>自定义组唯一标识 ID。</p>
     * @param GroupId <p>自定义组唯一标识 ID。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>自定义组名称。该字段不填时则保留原值。</p> 
     * @return GroupName <p>自定义组名称。该字段不填时则保留原值。</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>自定义组名称。该字段不填时则保留原值。</p>
     * @param GroupName <p>自定义组名称。该字段不填时则保留原值。</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>指定本次对 GroupItems 的更新方式。</p><p>枚举值：</p><ul><li>Replace： 使用 GroupItems 全量替换原有条目列表</li><li>Append： 追加 GroupItems 到组条目列表中</li><li>Remove： 从原有条目列表中移除与 GroupItems 中 Content 和 ItemType 均相同的条目。若指定条目不存在，则忽略该条目</li></ul><p>默认值：Replace</p> 
     * @return GroupItemOperation <p>指定本次对 GroupItems 的更新方式。</p><p>枚举值：</p><ul><li>Replace： 使用 GroupItems 全量替换原有条目列表</li><li>Append： 追加 GroupItems 到组条目列表中</li><li>Remove： 从原有条目列表中移除与 GroupItems 中 Content 和 ItemType 均相同的条目。若指定条目不存在，则忽略该条目</li></ul><p>默认值：Replace</p>
     */
    public String getGroupItemOperation() {
        return this.GroupItemOperation;
    }

    /**
     * Set <p>指定本次对 GroupItems 的更新方式。</p><p>枚举值：</p><ul><li>Replace： 使用 GroupItems 全量替换原有条目列表</li><li>Append： 追加 GroupItems 到组条目列表中</li><li>Remove： 从原有条目列表中移除与 GroupItems 中 Content 和 ItemType 均相同的条目。若指定条目不存在，则忽略该条目</li></ul><p>默认值：Replace</p>
     * @param GroupItemOperation <p>指定本次对 GroupItems 的更新方式。</p><p>枚举值：</p><ul><li>Replace： 使用 GroupItems 全量替换原有条目列表</li><li>Append： 追加 GroupItems 到组条目列表中</li><li>Remove： 从原有条目列表中移除与 GroupItems 中 Content 和 ItemType 均相同的条目。若指定条目不存在，则忽略该条目</li></ul><p>默认值：Replace</p>
     */
    public void setGroupItemOperation(String GroupItemOperation) {
        this.GroupItemOperation = GroupItemOperation;
    }

    /**
     * Get <p>自定义组条目列表。该字段不填时则保留原值。</p> 
     * @return GroupItems <p>自定义组条目列表。该字段不填时则保留原值。</p>
     */
    public CustomGroupItem [] getGroupItems() {
        return this.GroupItems;
    }

    /**
     * Set <p>自定义组条目列表。该字段不填时则保留原值。</p>
     * @param GroupItems <p>自定义组条目列表。该字段不填时则保留原值。</p>
     */
    public void setGroupItems(CustomGroupItem [] GroupItems) {
        this.GroupItems = GroupItems;
    }

    public ModifyCustomGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomGroupRequest(ModifyCustomGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupItemOperation != null) {
            this.GroupItemOperation = new String(source.GroupItemOperation);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupItemOperation", this.GroupItemOperation);
        this.setParamArrayObj(map, prefix + "GroupItems.", this.GroupItems);

    }
}

