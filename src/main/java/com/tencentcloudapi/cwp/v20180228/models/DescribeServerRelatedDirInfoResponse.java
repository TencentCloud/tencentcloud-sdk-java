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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerRelatedDirInfoResponse extends AbstractModel{

    /**
    * 服务器名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 服务器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 防护目录数量
    */
    @SerializedName("ProtectDirNum")
    @Expose
    private Long ProtectDirNum;

    /**
    * 防护文件数量
    */
    @SerializedName("ProtectFileNum")
    @Expose
    private Long ProtectFileNum;

    /**
    * 防篡改数量
    */
    @SerializedName("ProtectTamperNum")
    @Expose
    private Long ProtectTamperNum;

    /**
    * 防护软链数量
    */
    @SerializedName("ProtectLinkNum")
    @Expose
    private Long ProtectLinkNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务器名称 
     * @return HostName 服务器名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 服务器名称
     * @param HostName 服务器名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 服务器IP 
     * @return HostIp 服务器IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 服务器IP
     * @param HostIp 服务器IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 防护目录数量 
     * @return ProtectDirNum 防护目录数量
     */
    public Long getProtectDirNum() {
        return this.ProtectDirNum;
    }

    /**
     * Set 防护目录数量
     * @param ProtectDirNum 防护目录数量
     */
    public void setProtectDirNum(Long ProtectDirNum) {
        this.ProtectDirNum = ProtectDirNum;
    }

    /**
     * Get 防护文件数量 
     * @return ProtectFileNum 防护文件数量
     */
    public Long getProtectFileNum() {
        return this.ProtectFileNum;
    }

    /**
     * Set 防护文件数量
     * @param ProtectFileNum 防护文件数量
     */
    public void setProtectFileNum(Long ProtectFileNum) {
        this.ProtectFileNum = ProtectFileNum;
    }

    /**
     * Get 防篡改数量 
     * @return ProtectTamperNum 防篡改数量
     */
    public Long getProtectTamperNum() {
        return this.ProtectTamperNum;
    }

    /**
     * Set 防篡改数量
     * @param ProtectTamperNum 防篡改数量
     */
    public void setProtectTamperNum(Long ProtectTamperNum) {
        this.ProtectTamperNum = ProtectTamperNum;
    }

    /**
     * Get 防护软链数量 
     * @return ProtectLinkNum 防护软链数量
     */
    public Long getProtectLinkNum() {
        return this.ProtectLinkNum;
    }

    /**
     * Set 防护软链数量
     * @param ProtectLinkNum 防护软链数量
     */
    public void setProtectLinkNum(Long ProtectLinkNum) {
        this.ProtectLinkNum = ProtectLinkNum;
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

    public DescribeServerRelatedDirInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerRelatedDirInfoResponse(DescribeServerRelatedDirInfoResponse source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.ProtectDirNum != null) {
            this.ProtectDirNum = new Long(source.ProtectDirNum);
        }
        if (source.ProtectFileNum != null) {
            this.ProtectFileNum = new Long(source.ProtectFileNum);
        }
        if (source.ProtectTamperNum != null) {
            this.ProtectTamperNum = new Long(source.ProtectTamperNum);
        }
        if (source.ProtectLinkNum != null) {
            this.ProtectLinkNum = new Long(source.ProtectLinkNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "ProtectDirNum", this.ProtectDirNum);
        this.setParamSimple(map, prefix + "ProtectFileNum", this.ProtectFileNum);
        this.setParamSimple(map, prefix + "ProtectTamperNum", this.ProtectTamperNum);
        this.setParamSimple(map, prefix + "ProtectLinkNum", this.ProtectLinkNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

