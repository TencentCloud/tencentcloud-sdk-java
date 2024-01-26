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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HeartBeatResponse extends AbstractModel {

    /**
    * 资源唯一路径
    */
    @SerializedName("ResourcePath")
    @Expose
    private String ResourcePath;

    /**
    * 锁持有者id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockerId")
    @Expose
    private Long LockerId;

    /**
    * 锁持有者displayName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockerName")
    @Expose
    private String LockerName;

    /**
    * 偷锁标志（有人偷锁为true）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StealFlag")
    @Expose
    private Boolean StealFlag;

    /**
    * 持有锁标志（true表示被自己锁定）
    */
    @SerializedName("LockedByMe")
    @Expose
    private Boolean LockedByMe;

    /**
    * 资源是否被锁定
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

    /**
    * 资源是否正在被编辑
    */
    @SerializedName("EditFlag")
    @Expose
    private Boolean EditFlag;

    /**
    * 资源被锁定时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源唯一路径 
     * @return ResourcePath 资源唯一路径
     */
    public String getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set 资源唯一路径
     * @param ResourcePath 资源唯一路径
     */
    public void setResourcePath(String ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    /**
     * Get 锁持有者id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockerId 锁持有者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockerId() {
        return this.LockerId;
    }

    /**
     * Set 锁持有者id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockerId 锁持有者id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockerId(Long LockerId) {
        this.LockerId = LockerId;
    }

    /**
     * Get 锁持有者displayName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockerName 锁持有者displayName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLockerName() {
        return this.LockerName;
    }

    /**
     * Set 锁持有者displayName
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockerName 锁持有者displayName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockerName(String LockerName) {
        this.LockerName = LockerName;
    }

    /**
     * Get 偷锁标志（有人偷锁为true）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StealFlag 偷锁标志（有人偷锁为true）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStealFlag() {
        return this.StealFlag;
    }

    /**
     * Set 偷锁标志（有人偷锁为true）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StealFlag 偷锁标志（有人偷锁为true）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStealFlag(Boolean StealFlag) {
        this.StealFlag = StealFlag;
    }

    /**
     * Get 持有锁标志（true表示被自己锁定） 
     * @return LockedByMe 持有锁标志（true表示被自己锁定）
     */
    public Boolean getLockedByMe() {
        return this.LockedByMe;
    }

    /**
     * Set 持有锁标志（true表示被自己锁定）
     * @param LockedByMe 持有锁标志（true表示被自己锁定）
     */
    public void setLockedByMe(Boolean LockedByMe) {
        this.LockedByMe = LockedByMe;
    }

    /**
     * Get 资源是否被锁定 
     * @return Locked 资源是否被锁定
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set 资源是否被锁定
     * @param Locked 资源是否被锁定
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 资源是否正在被编辑 
     * @return EditFlag 资源是否正在被编辑
     */
    public Boolean getEditFlag() {
        return this.EditFlag;
    }

    /**
     * Set 资源是否正在被编辑
     * @param EditFlag 资源是否正在被编辑
     */
    public void setEditFlag(Boolean EditFlag) {
        this.EditFlag = EditFlag;
    }

    /**
     * Get 资源被锁定时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockTime 资源被锁定时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 资源被锁定时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockTime 资源被锁定时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public HeartBeatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeartBeatResponse(HeartBeatResponse source) {
        if (source.ResourcePath != null) {
            this.ResourcePath = new String(source.ResourcePath);
        }
        if (source.LockerId != null) {
            this.LockerId = new Long(source.LockerId);
        }
        if (source.LockerName != null) {
            this.LockerName = new String(source.LockerName);
        }
        if (source.StealFlag != null) {
            this.StealFlag = new Boolean(source.StealFlag);
        }
        if (source.LockedByMe != null) {
            this.LockedByMe = new Boolean(source.LockedByMe);
        }
        if (source.Locked != null) {
            this.Locked = new Boolean(source.Locked);
        }
        if (source.EditFlag != null) {
            this.EditFlag = new Boolean(source.EditFlag);
        }
        if (source.LockTime != null) {
            this.LockTime = new Long(source.LockTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourcePath", this.ResourcePath);
        this.setParamSimple(map, prefix + "LockerId", this.LockerId);
        this.setParamSimple(map, prefix + "LockerName", this.LockerName);
        this.setParamSimple(map, prefix + "StealFlag", this.StealFlag);
        this.setParamSimple(map, prefix + "LockedByMe", this.LockedByMe);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "EditFlag", this.EditFlag);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

