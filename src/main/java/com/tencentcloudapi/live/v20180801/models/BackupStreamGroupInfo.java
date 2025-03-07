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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupStreamGroupInfo extends AbstractModel {

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 主备流信息。
    */
    @SerializedName("BackupList")
    @Expose
    private BackupStreamDetailData [] BackupList;

    /**
    * 是否对该流开启了择优调度。
0 - 未开启。
1 - 已开启。
    */
    @SerializedName("OptimalEnable")
    @Expose
    private Long OptimalEnable;

    /**
    * 域名分组的分组名称。
    */
    @SerializedName("HostGroupName")
    @Expose
    private String HostGroupName;

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 主备流信息。 
     * @return BackupList 主备流信息。
     */
    public BackupStreamDetailData [] getBackupList() {
        return this.BackupList;
    }

    /**
     * Set 主备流信息。
     * @param BackupList 主备流信息。
     */
    public void setBackupList(BackupStreamDetailData [] BackupList) {
        this.BackupList = BackupList;
    }

    /**
     * Get 是否对该流开启了择优调度。
0 - 未开启。
1 - 已开启。 
     * @return OptimalEnable 是否对该流开启了择优调度。
0 - 未开启。
1 - 已开启。
     */
    public Long getOptimalEnable() {
        return this.OptimalEnable;
    }

    /**
     * Set 是否对该流开启了择优调度。
0 - 未开启。
1 - 已开启。
     * @param OptimalEnable 是否对该流开启了择优调度。
0 - 未开启。
1 - 已开启。
     */
    public void setOptimalEnable(Long OptimalEnable) {
        this.OptimalEnable = OptimalEnable;
    }

    /**
     * Get 域名分组的分组名称。 
     * @return HostGroupName 域名分组的分组名称。
     */
    public String getHostGroupName() {
        return this.HostGroupName;
    }

    /**
     * Set 域名分组的分组名称。
     * @param HostGroupName 域名分组的分组名称。
     */
    public void setHostGroupName(String HostGroupName) {
        this.HostGroupName = HostGroupName;
    }

    public BackupStreamGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStreamGroupInfo(BackupStreamGroupInfo source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.BackupList != null) {
            this.BackupList = new BackupStreamDetailData[source.BackupList.length];
            for (int i = 0; i < source.BackupList.length; i++) {
                this.BackupList[i] = new BackupStreamDetailData(source.BackupList[i]);
            }
        }
        if (source.OptimalEnable != null) {
            this.OptimalEnable = new Long(source.OptimalEnable);
        }
        if (source.HostGroupName != null) {
            this.HostGroupName = new String(source.HostGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamArrayObj(map, prefix + "BackupList.", this.BackupList);
        this.setParamSimple(map, prefix + "OptimalEnable", this.OptimalEnable);
        this.setParamSimple(map, prefix + "HostGroupName", this.HostGroupName);

    }
}

