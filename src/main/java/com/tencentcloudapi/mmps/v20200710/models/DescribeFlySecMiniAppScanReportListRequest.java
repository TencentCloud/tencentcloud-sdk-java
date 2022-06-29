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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlySecMiniAppScanReportListRequest extends AbstractModel{

    /**
    * 小程序AppID
    */
    @SerializedName("MiniAppID")
    @Expose
    private String MiniAppID;

    /**
    * 诊断方式 1:基础诊断，2:深度诊断
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 诊断状态 -1:查询全部, 0:排队中, 1:成功, 2:失败, 3:进行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 查询数量, 0:查询所有, 其他值:最近几次的诊断数量
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 小程序版本
    */
    @SerializedName("MiniAppVersion")
    @Expose
    private String MiniAppVersion;

    /**
     * Get 小程序AppID 
     * @return MiniAppID 小程序AppID
     */
    public String getMiniAppID() {
        return this.MiniAppID;
    }

    /**
     * Set 小程序AppID
     * @param MiniAppID 小程序AppID
     */
    public void setMiniAppID(String MiniAppID) {
        this.MiniAppID = MiniAppID;
    }

    /**
     * Get 诊断方式 1:基础诊断，2:深度诊断 
     * @return Mode 诊断方式 1:基础诊断，2:深度诊断
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 诊断方式 1:基础诊断，2:深度诊断
     * @param Mode 诊断方式 1:基础诊断，2:深度诊断
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 诊断状态 -1:查询全部, 0:排队中, 1:成功, 2:失败, 3:进行中 
     * @return Status 诊断状态 -1:查询全部, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 诊断状态 -1:查询全部, 0:排队中, 1:成功, 2:失败, 3:进行中
     * @param Status 诊断状态 -1:查询全部, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 查询数量, 0:查询所有, 其他值:最近几次的诊断数量 
     * @return Size 查询数量, 0:查询所有, 其他值:最近几次的诊断数量
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 查询数量, 0:查询所有, 其他值:最近几次的诊断数量
     * @param Size 查询数量, 0:查询所有, 其他值:最近几次的诊断数量
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 小程序版本 
     * @return MiniAppVersion 小程序版本
     */
    public String getMiniAppVersion() {
        return this.MiniAppVersion;
    }

    /**
     * Set 小程序版本
     * @param MiniAppVersion 小程序版本
     */
    public void setMiniAppVersion(String MiniAppVersion) {
        this.MiniAppVersion = MiniAppVersion;
    }

    public DescribeFlySecMiniAppScanReportListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlySecMiniAppScanReportListRequest(DescribeFlySecMiniAppScanReportListRequest source) {
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.MiniAppVersion != null) {
            this.MiniAppVersion = new String(source.MiniAppVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "MiniAppVersion", this.MiniAppVersion);

    }
}

