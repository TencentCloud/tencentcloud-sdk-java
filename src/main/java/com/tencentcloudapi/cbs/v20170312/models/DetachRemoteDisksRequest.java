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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachRemoteDisksRequest extends AbstractModel {

    /**
    * <p>指定从特定CVM实例上卸载单副本SSD硬盘。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>一个或多个将要卸载的单副本SSD硬盘ID。</p>
    */
    @SerializedName("RemoteDiskIds")
    @Expose
    private String [] RemoteDiskIds;

    /**
    * <p>强制解挂，内部使用。</p>
    */
    @SerializedName("ForceDetach")
    @Expose
    private Boolean ForceDetach;

    /**
     * Get <p>指定从特定CVM实例上卸载单副本SSD硬盘。</p> 
     * @return InstanceId <p>指定从特定CVM实例上卸载单副本SSD硬盘。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定从特定CVM实例上卸载单副本SSD硬盘。</p>
     * @param InstanceId <p>指定从特定CVM实例上卸载单副本SSD硬盘。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>一个或多个将要卸载的单副本SSD硬盘ID。</p> 
     * @return RemoteDiskIds <p>一个或多个将要卸载的单副本SSD硬盘ID。</p>
     */
    public String [] getRemoteDiskIds() {
        return this.RemoteDiskIds;
    }

    /**
     * Set <p>一个或多个将要卸载的单副本SSD硬盘ID。</p>
     * @param RemoteDiskIds <p>一个或多个将要卸载的单副本SSD硬盘ID。</p>
     */
    public void setRemoteDiskIds(String [] RemoteDiskIds) {
        this.RemoteDiskIds = RemoteDiskIds;
    }

    /**
     * Get <p>强制解挂，内部使用。</p> 
     * @return ForceDetach <p>强制解挂，内部使用。</p>
     */
    public Boolean getForceDetach() {
        return this.ForceDetach;
    }

    /**
     * Set <p>强制解挂，内部使用。</p>
     * @param ForceDetach <p>强制解挂，内部使用。</p>
     */
    public void setForceDetach(Boolean ForceDetach) {
        this.ForceDetach = ForceDetach;
    }

    public DetachRemoteDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachRemoteDisksRequest(DetachRemoteDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RemoteDiskIds != null) {
            this.RemoteDiskIds = new String[source.RemoteDiskIds.length];
            for (int i = 0; i < source.RemoteDiskIds.length; i++) {
                this.RemoteDiskIds[i] = new String(source.RemoteDiskIds[i]);
            }
        }
        if (source.ForceDetach != null) {
            this.ForceDetach = new Boolean(source.ForceDetach);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "RemoteDiskIds.", this.RemoteDiskIds);
        this.setParamSimple(map, prefix + "ForceDetach", this.ForceDetach);

    }
}

