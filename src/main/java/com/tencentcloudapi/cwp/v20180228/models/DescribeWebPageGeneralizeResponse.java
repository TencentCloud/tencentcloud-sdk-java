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

public class DescribeWebPageGeneralizeResponse extends AbstractModel{

    /**
    * 防护监测 0 未开启 1 已开启 2 异常
    */
    @SerializedName("ProtectMonitor")
    @Expose
    private Long ProtectMonitor;

    /**
    * 防护目录数
    */
    @SerializedName("ProtectDirNum")
    @Expose
    private Long ProtectDirNum;

    /**
    * 防护文件数
    */
    @SerializedName("ProtectFileNum")
    @Expose
    private Long ProtectFileNum;

    /**
    * 篡改文件数
    */
    @SerializedName("TamperFileNum")
    @Expose
    private Long TamperFileNum;

    /**
    * 篡改数
    */
    @SerializedName("TamperNum")
    @Expose
    private Long TamperNum;

    /**
    * 今日防护数
    */
    @SerializedName("ProtectToday")
    @Expose
    private Long ProtectToday;

    /**
    * 防护主机数
    */
    @SerializedName("ProtectHostNum")
    @Expose
    private Long ProtectHostNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 防护监测 0 未开启 1 已开启 2 异常 
     * @return ProtectMonitor 防护监测 0 未开启 1 已开启 2 异常
     */
    public Long getProtectMonitor() {
        return this.ProtectMonitor;
    }

    /**
     * Set 防护监测 0 未开启 1 已开启 2 异常
     * @param ProtectMonitor 防护监测 0 未开启 1 已开启 2 异常
     */
    public void setProtectMonitor(Long ProtectMonitor) {
        this.ProtectMonitor = ProtectMonitor;
    }

    /**
     * Get 防护目录数 
     * @return ProtectDirNum 防护目录数
     */
    public Long getProtectDirNum() {
        return this.ProtectDirNum;
    }

    /**
     * Set 防护目录数
     * @param ProtectDirNum 防护目录数
     */
    public void setProtectDirNum(Long ProtectDirNum) {
        this.ProtectDirNum = ProtectDirNum;
    }

    /**
     * Get 防护文件数 
     * @return ProtectFileNum 防护文件数
     */
    public Long getProtectFileNum() {
        return this.ProtectFileNum;
    }

    /**
     * Set 防护文件数
     * @param ProtectFileNum 防护文件数
     */
    public void setProtectFileNum(Long ProtectFileNum) {
        this.ProtectFileNum = ProtectFileNum;
    }

    /**
     * Get 篡改文件数 
     * @return TamperFileNum 篡改文件数
     */
    public Long getTamperFileNum() {
        return this.TamperFileNum;
    }

    /**
     * Set 篡改文件数
     * @param TamperFileNum 篡改文件数
     */
    public void setTamperFileNum(Long TamperFileNum) {
        this.TamperFileNum = TamperFileNum;
    }

    /**
     * Get 篡改数 
     * @return TamperNum 篡改数
     */
    public Long getTamperNum() {
        return this.TamperNum;
    }

    /**
     * Set 篡改数
     * @param TamperNum 篡改数
     */
    public void setTamperNum(Long TamperNum) {
        this.TamperNum = TamperNum;
    }

    /**
     * Get 今日防护数 
     * @return ProtectToday 今日防护数
     */
    public Long getProtectToday() {
        return this.ProtectToday;
    }

    /**
     * Set 今日防护数
     * @param ProtectToday 今日防护数
     */
    public void setProtectToday(Long ProtectToday) {
        this.ProtectToday = ProtectToday;
    }

    /**
     * Get 防护主机数 
     * @return ProtectHostNum 防护主机数
     */
    public Long getProtectHostNum() {
        return this.ProtectHostNum;
    }

    /**
     * Set 防护主机数
     * @param ProtectHostNum 防护主机数
     */
    public void setProtectHostNum(Long ProtectHostNum) {
        this.ProtectHostNum = ProtectHostNum;
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

    public DescribeWebPageGeneralizeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebPageGeneralizeResponse(DescribeWebPageGeneralizeResponse source) {
        if (source.ProtectMonitor != null) {
            this.ProtectMonitor = new Long(source.ProtectMonitor);
        }
        if (source.ProtectDirNum != null) {
            this.ProtectDirNum = new Long(source.ProtectDirNum);
        }
        if (source.ProtectFileNum != null) {
            this.ProtectFileNum = new Long(source.ProtectFileNum);
        }
        if (source.TamperFileNum != null) {
            this.TamperFileNum = new Long(source.TamperFileNum);
        }
        if (source.TamperNum != null) {
            this.TamperNum = new Long(source.TamperNum);
        }
        if (source.ProtectToday != null) {
            this.ProtectToday = new Long(source.ProtectToday);
        }
        if (source.ProtectHostNum != null) {
            this.ProtectHostNum = new Long(source.ProtectHostNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectMonitor", this.ProtectMonitor);
        this.setParamSimple(map, prefix + "ProtectDirNum", this.ProtectDirNum);
        this.setParamSimple(map, prefix + "ProtectFileNum", this.ProtectFileNum);
        this.setParamSimple(map, prefix + "TamperFileNum", this.TamperFileNum);
        this.setParamSimple(map, prefix + "TamperNum", this.TamperNum);
        this.setParamSimple(map, prefix + "ProtectToday", this.ProtectToday);
        this.setParamSimple(map, prefix + "ProtectHostNum", this.ProtectHostNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

