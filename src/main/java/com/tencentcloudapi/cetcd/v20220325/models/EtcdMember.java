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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EtcdMember extends AbstractModel {

    /**
    * 节点名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点当前版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 所属可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 节点名字 
     * @return Name 节点名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名字
     * @param Name 节点名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点当前版本 
     * @return Version 节点当前版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 节点当前版本
     * @param Version 节点当前版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 所属可用区 
     * @return Zone 所属可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 所属可用区
     * @param Zone 所属可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点状态 
     * @return Status 节点状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态
     * @param Status 节点状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public EtcdMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtcdMember(EtcdMember source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

