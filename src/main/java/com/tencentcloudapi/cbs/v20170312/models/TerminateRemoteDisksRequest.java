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

public class TerminateRemoteDisksRequest extends AbstractModel {

    /**
    * <p>一个或多个单副本SSD硬盘ID。</p>
    */
    @SerializedName("RemoteDiskIds")
    @Expose
    private String [] RemoteDiskIds;

    /**
     * Get <p>一个或多个单副本SSD硬盘ID。</p> 
     * @return RemoteDiskIds <p>一个或多个单副本SSD硬盘ID。</p>
     */
    public String [] getRemoteDiskIds() {
        return this.RemoteDiskIds;
    }

    /**
     * Set <p>一个或多个单副本SSD硬盘ID。</p>
     * @param RemoteDiskIds <p>一个或多个单副本SSD硬盘ID。</p>
     */
    public void setRemoteDiskIds(String [] RemoteDiskIds) {
        this.RemoteDiskIds = RemoteDiskIds;
    }

    public TerminateRemoteDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateRemoteDisksRequest(TerminateRemoteDisksRequest source) {
        if (source.RemoteDiskIds != null) {
            this.RemoteDiskIds = new String[source.RemoteDiskIds.length];
            for (int i = 0; i < source.RemoteDiskIds.length; i++) {
                this.RemoteDiskIds[i] = new String(source.RemoteDiskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RemoteDiskIds.", this.RemoteDiskIds);

    }
}

