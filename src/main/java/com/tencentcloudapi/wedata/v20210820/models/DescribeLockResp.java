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

public class DescribeLockResp extends AbstractModel {

    /**
    * 锁持有人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockerId")
    @Expose
    private Long LockerId;

    /**
    * 锁持有人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockerName")
    @Expose
    private String LockerName;

    /**
    * 资源路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePath")
    @Expose
    private String ResourcePath;

    /**
    * 持有锁标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockedByMe")
    @Expose
    private Boolean LockedByMe;

    /**
    * 锁定时间时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
     * Get 锁持有人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockerId 锁持有人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockerId() {
        return this.LockerId;
    }

    /**
     * Set 锁持有人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockerId 锁持有人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockerId(Long LockerId) {
        this.LockerId = LockerId;
    }

    /**
     * Get 锁持有人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockerName 锁持有人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLockerName() {
        return this.LockerName;
    }

    /**
     * Set 锁持有人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockerName 锁持有人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockerName(String LockerName) {
        this.LockerName = LockerName;
    }

    /**
     * Get 资源路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePath 资源路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set 资源路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePath 资源路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePath(String ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    /**
     * Get 持有锁标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockedByMe 持有锁标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLockedByMe() {
        return this.LockedByMe;
    }

    /**
     * Set 持有锁标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockedByMe 持有锁标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockedByMe(Boolean LockedByMe) {
        this.LockedByMe = LockedByMe;
    }

    /**
     * Get 锁定时间时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockTime 锁定时间时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set 锁定时间时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockTime 锁定时间时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    public DescribeLockResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLockResp(DescribeLockResp source) {
        if (source.LockerId != null) {
            this.LockerId = new Long(source.LockerId);
        }
        if (source.LockerName != null) {
            this.LockerName = new String(source.LockerName);
        }
        if (source.ResourcePath != null) {
            this.ResourcePath = new String(source.ResourcePath);
        }
        if (source.LockedByMe != null) {
            this.LockedByMe = new Boolean(source.LockedByMe);
        }
        if (source.LockTime != null) {
            this.LockTime = new Long(source.LockTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LockerId", this.LockerId);
        this.setParamSimple(map, prefix + "LockerName", this.LockerName);
        this.setParamSimple(map, prefix + "ResourcePath", this.ResourcePath);
        this.setParamSimple(map, prefix + "LockedByMe", this.LockedByMe);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);

    }
}

