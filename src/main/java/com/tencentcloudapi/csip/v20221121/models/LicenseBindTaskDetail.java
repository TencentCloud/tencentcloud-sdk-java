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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseBindTaskDetail extends AbstractModel {

    /**
    * <p>云服务器UUID</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>0 执行中, 1 成功,2失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>修复建议</p>
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
    * <p>机器额外信息</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get <p>云服务器UUID</p> 
     * @return Quuid <p>云服务器UUID</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>云服务器UUID</p>
     * @param Quuid <p>云服务器UUID</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrMsg <p>错误信息</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrMsg <p>错误信息</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>0 执行中, 1 成功,2失败</p> 
     * @return Status <p>0 执行中, 1 成功,2失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>0 执行中, 1 成功,2失败</p>
     * @param Status <p>0 执行中, 1 成功,2失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>修复建议</p> 
     * @return FixMessage <p>修复建议</p>
     */
    public String getFixMessage() {
        return this.FixMessage;
    }

    /**
     * Set <p>修复建议</p>
     * @param FixMessage <p>修复建议</p>
     */
    public void setFixMessage(String FixMessage) {
        this.FixMessage = FixMessage;
    }

    /**
     * Get <p>机器额外信息</p> 
     * @return MachineExtraInfo <p>机器额外信息</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>机器额外信息</p>
     * @param MachineExtraInfo <p>机器额外信息</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public LicenseBindTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseBindTaskDetail(LicenseBindTaskDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FixMessage != null) {
            this.FixMessage = new String(source.FixMessage);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FixMessage", this.FixMessage);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

