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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulScanTaskRequest extends AbstractModel{

    /**
    * 本地镜像扫描范围类型。ALL:全部本地镜像，NOT_SCAN：全部已授权未扫描本地镜像，IMAGEIDS:自选本地镜像ID
    */
    @SerializedName("LocalImageScanType")
    @Expose
    private String LocalImageScanType;

    /**
    * 根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。
    */
    @SerializedName("LocalImageIDs")
    @Expose
    private String [] LocalImageIDs;

    /**
    * 仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID
    */
    @SerializedName("RegistryImageScanType")
    @Expose
    private String RegistryImageScanType;

    /**
    * 根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。
    */
    @SerializedName("RegistryImageIDs")
    @Expose
    private Long [] RegistryImageIDs;

    /**
    * 本地镜像重新漏洞扫描时的任务ID
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * 仓库镜像重新漏洞扫描时的任务ID
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
     * Get 本地镜像扫描范围类型。ALL:全部本地镜像，NOT_SCAN：全部已授权未扫描本地镜像，IMAGEIDS:自选本地镜像ID 
     * @return LocalImageScanType 本地镜像扫描范围类型。ALL:全部本地镜像，NOT_SCAN：全部已授权未扫描本地镜像，IMAGEIDS:自选本地镜像ID
     */
    public String getLocalImageScanType() {
        return this.LocalImageScanType;
    }

    /**
     * Set 本地镜像扫描范围类型。ALL:全部本地镜像，NOT_SCAN：全部已授权未扫描本地镜像，IMAGEIDS:自选本地镜像ID
     * @param LocalImageScanType 本地镜像扫描范围类型。ALL:全部本地镜像，NOT_SCAN：全部已授权未扫描本地镜像，IMAGEIDS:自选本地镜像ID
     */
    public void setLocalImageScanType(String LocalImageScanType) {
        this.LocalImageScanType = LocalImageScanType;
    }

    /**
     * Get 根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。 
     * @return LocalImageIDs 根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。
     */
    public String [] getLocalImageIDs() {
        return this.LocalImageIDs;
    }

    /**
     * Set 根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。
     * @param LocalImageIDs 根据已授权的本地镜像IDs扫描，优先权高于根据满足条件的已授权的本地镜像。
     */
    public void setLocalImageIDs(String [] LocalImageIDs) {
        this.LocalImageIDs = LocalImageIDs;
    }

    /**
     * Get 仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID 
     * @return RegistryImageScanType 仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID
     */
    public String getRegistryImageScanType() {
        return this.RegistryImageScanType;
    }

    /**
     * Set 仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID
     * @param RegistryImageScanType 仓库镜像扫描范围类型。ALL:全部仓库镜像，NOT_SCAN：全部已授权未扫描仓库镜像，IMAGEIDS:自选仓库镜像ID
     */
    public void setRegistryImageScanType(String RegistryImageScanType) {
        this.RegistryImageScanType = RegistryImageScanType;
    }

    /**
     * Get 根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。 
     * @return RegistryImageIDs 根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。
     */
    public Long [] getRegistryImageIDs() {
        return this.RegistryImageIDs;
    }

    /**
     * Set 根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。
     * @param RegistryImageIDs 根据已授权的仓库镜像IDs扫描，优先权高于根据满足条件的已授权的仓库镜像。
     */
    public void setRegistryImageIDs(Long [] RegistryImageIDs) {
        this.RegistryImageIDs = RegistryImageIDs;
    }

    /**
     * Get 本地镜像重新漏洞扫描时的任务ID 
     * @return LocalTaskID 本地镜像重新漏洞扫描时的任务ID
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set 本地镜像重新漏洞扫描时的任务ID
     * @param LocalTaskID 本地镜像重新漏洞扫描时的任务ID
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get 仓库镜像重新漏洞扫描时的任务ID 
     * @return RegistryTaskID 仓库镜像重新漏洞扫描时的任务ID
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set 仓库镜像重新漏洞扫描时的任务ID
     * @param RegistryTaskID 仓库镜像重新漏洞扫描时的任务ID
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    public CreateVulScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulScanTaskRequest(CreateVulScanTaskRequest source) {
        if (source.LocalImageScanType != null) {
            this.LocalImageScanType = new String(source.LocalImageScanType);
        }
        if (source.LocalImageIDs != null) {
            this.LocalImageIDs = new String[source.LocalImageIDs.length];
            for (int i = 0; i < source.LocalImageIDs.length; i++) {
                this.LocalImageIDs[i] = new String(source.LocalImageIDs[i]);
            }
        }
        if (source.RegistryImageScanType != null) {
            this.RegistryImageScanType = new String(source.RegistryImageScanType);
        }
        if (source.RegistryImageIDs != null) {
            this.RegistryImageIDs = new Long[source.RegistryImageIDs.length];
            for (int i = 0; i < source.RegistryImageIDs.length; i++) {
                this.RegistryImageIDs[i] = new Long(source.RegistryImageIDs[i]);
            }
        }
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalImageScanType", this.LocalImageScanType);
        this.setParamArraySimple(map, prefix + "LocalImageIDs.", this.LocalImageIDs);
        this.setParamSimple(map, prefix + "RegistryImageScanType", this.RegistryImageScanType);
        this.setParamArraySimple(map, prefix + "RegistryImageIDs.", this.RegistryImageIDs);
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);

    }
}

