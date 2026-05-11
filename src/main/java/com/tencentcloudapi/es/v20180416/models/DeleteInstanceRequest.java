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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstanceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>回收站锁定设置，true时不可手动销毁，到预设时间后自动销毁</p><p>默认值：false</p>
    */
    @SerializedName("LockEnabled")
    @Expose
    private Boolean LockEnabled;

    /**
    * <p>放入回收站的锁定时间</p><p>取值范围：[1, 7]</p><p>单位：天</p><p>默认值：1</p>
    */
    @SerializedName("LockDuration")
    @Expose
    private Long LockDuration;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>回收站锁定设置，true时不可手动销毁，到预设时间后自动销毁</p><p>默认值：false</p> 
     * @return LockEnabled <p>回收站锁定设置，true时不可手动销毁，到预设时间后自动销毁</p><p>默认值：false</p>
     */
    public Boolean getLockEnabled() {
        return this.LockEnabled;
    }

    /**
     * Set <p>回收站锁定设置，true时不可手动销毁，到预设时间后自动销毁</p><p>默认值：false</p>
     * @param LockEnabled <p>回收站锁定设置，true时不可手动销毁，到预设时间后自动销毁</p><p>默认值：false</p>
     */
    public void setLockEnabled(Boolean LockEnabled) {
        this.LockEnabled = LockEnabled;
    }

    /**
     * Get <p>放入回收站的锁定时间</p><p>取值范围：[1, 7]</p><p>单位：天</p><p>默认值：1</p> 
     * @return LockDuration <p>放入回收站的锁定时间</p><p>取值范围：[1, 7]</p><p>单位：天</p><p>默认值：1</p>
     */
    public Long getLockDuration() {
        return this.LockDuration;
    }

    /**
     * Set <p>放入回收站的锁定时间</p><p>取值范围：[1, 7]</p><p>单位：天</p><p>默认值：1</p>
     * @param LockDuration <p>放入回收站的锁定时间</p><p>取值范围：[1, 7]</p><p>单位：天</p><p>默认值：1</p>
     */
    public void setLockDuration(Long LockDuration) {
        this.LockDuration = LockDuration;
    }

    public DeleteInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInstanceRequest(DeleteInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LockEnabled != null) {
            this.LockEnabled = new Boolean(source.LockEnabled);
        }
        if (source.LockDuration != null) {
            this.LockDuration = new Long(source.LockDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LockEnabled", this.LockEnabled);
        this.setParamSimple(map, prefix + "LockDuration", this.LockDuration);

    }
}

