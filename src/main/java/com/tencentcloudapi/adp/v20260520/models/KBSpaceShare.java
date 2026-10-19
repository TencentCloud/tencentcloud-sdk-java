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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBSpaceShare extends AbstractModel {

    /**
    * <p>是否已被其他空间引用</p>
    */
    @SerializedName("IsSpaceShared")
    @Expose
    private Boolean IsSpaceShared;

    /**
    * <p>被引用空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharedSpaceList")
    @Expose
    private Identity [] SharedSpaceList;

    /**
    * <p>共享状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubStatus")
    @Expose
    private KBShareStatus SubStatus;

    /**
    * <p>是否允许操作</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get <p>是否已被其他空间引用</p> 
     * @return IsSpaceShared <p>是否已被其他空间引用</p>
     */
    public Boolean getIsSpaceShared() {
        return this.IsSpaceShared;
    }

    /**
     * Set <p>是否已被其他空间引用</p>
     * @param IsSpaceShared <p>是否已被其他空间引用</p>
     */
    public void setIsSpaceShared(Boolean IsSpaceShared) {
        this.IsSpaceShared = IsSpaceShared;
    }

    /**
     * Get <p>被引用空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharedSpaceList <p>被引用空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Identity [] getSharedSpaceList() {
        return this.SharedSpaceList;
    }

    /**
     * Set <p>被引用空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharedSpaceList <p>被引用空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharedSpaceList(Identity [] SharedSpaceList) {
        this.SharedSpaceList = SharedSpaceList;
    }

    /**
     * Get <p>共享状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubStatus <p>共享状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KBShareStatus getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>共享状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubStatus <p>共享状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubStatus(KBShareStatus SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>是否允许操作</p> 
     * @return Enable <p>是否允许操作</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否允许操作</p>
     * @param Enable <p>是否允许操作</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public KBSpaceShare() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBSpaceShare(KBSpaceShare source) {
        if (source.IsSpaceShared != null) {
            this.IsSpaceShared = new Boolean(source.IsSpaceShared);
        }
        if (source.SharedSpaceList != null) {
            this.SharedSpaceList = new Identity[source.SharedSpaceList.length];
            for (int i = 0; i < source.SharedSpaceList.length; i++) {
                this.SharedSpaceList[i] = new Identity(source.SharedSpaceList[i]);
            }
        }
        if (source.SubStatus != null) {
            this.SubStatus = new KBShareStatus(source.SubStatus);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSpaceShared", this.IsSpaceShared);
        this.setParamArrayObj(map, prefix + "SharedSpaceList.", this.SharedSpaceList);
        this.setParamObj(map, prefix + "SubStatus.", this.SubStatus);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

