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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppletResult extends AbstractModel{

    /**
    * 加固任务结果id
    */
    @SerializedName("ResultId")
    @Expose
    private String ResultId;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 操作账号
    */
    @SerializedName("OpUin")
    @Expose
    private Long OpUin;

    /**
    * 加固结果
    */
    @SerializedName("EncryptState")
    @Expose
    private Long EncryptState;

    /**
    * 加固结果描述
    */
    @SerializedName("EncryptStateDesc")
    @Expose
    private String EncryptStateDesc;

    /**
    * 失败错误码
    */
    @SerializedName("EncryptErrCode")
    @Expose
    private Long EncryptErrCode;

    /**
    * 失败原因
    */
    @SerializedName("EncryptErrDesc")
    @Expose
    private String EncryptErrDesc;

    /**
    * 解决方案
    */
    @SerializedName("EncryptErrRef")
    @Expose
    private String EncryptErrRef;

    /**
    * 任务创建时间
    */
    @SerializedName("CreatTime")
    @Expose
    private String CreatTime;

    /**
    * 任务开始处理时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务处理结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 加固耗时（秒单位）
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 在线加固成功下载包
    */
    @SerializedName("EncryptPkgUrl")
    @Expose
    private String EncryptPkgUrl;

    /**
    * 本次加固配置
    */
    @SerializedName("AppletInfo")
    @Expose
    private AppletInfo AppletInfo;

    /**
     * Get 加固任务结果id 
     * @return ResultId 加固任务结果id
     */
    public String getResultId() {
        return this.ResultId;
    }

    /**
     * Set 加固任务结果id
     * @param ResultId 加固任务结果id
     */
    public void setResultId(String ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 操作账号 
     * @return OpUin 操作账号
     */
    public Long getOpUin() {
        return this.OpUin;
    }

    /**
     * Set 操作账号
     * @param OpUin 操作账号
     */
    public void setOpUin(Long OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * Get 加固结果 
     * @return EncryptState 加固结果
     */
    public Long getEncryptState() {
        return this.EncryptState;
    }

    /**
     * Set 加固结果
     * @param EncryptState 加固结果
     */
    public void setEncryptState(Long EncryptState) {
        this.EncryptState = EncryptState;
    }

    /**
     * Get 加固结果描述 
     * @return EncryptStateDesc 加固结果描述
     */
    public String getEncryptStateDesc() {
        return this.EncryptStateDesc;
    }

    /**
     * Set 加固结果描述
     * @param EncryptStateDesc 加固结果描述
     */
    public void setEncryptStateDesc(String EncryptStateDesc) {
        this.EncryptStateDesc = EncryptStateDesc;
    }

    /**
     * Get 失败错误码 
     * @return EncryptErrCode 失败错误码
     */
    public Long getEncryptErrCode() {
        return this.EncryptErrCode;
    }

    /**
     * Set 失败错误码
     * @param EncryptErrCode 失败错误码
     */
    public void setEncryptErrCode(Long EncryptErrCode) {
        this.EncryptErrCode = EncryptErrCode;
    }

    /**
     * Get 失败原因 
     * @return EncryptErrDesc 失败原因
     */
    public String getEncryptErrDesc() {
        return this.EncryptErrDesc;
    }

    /**
     * Set 失败原因
     * @param EncryptErrDesc 失败原因
     */
    public void setEncryptErrDesc(String EncryptErrDesc) {
        this.EncryptErrDesc = EncryptErrDesc;
    }

    /**
     * Get 解决方案 
     * @return EncryptErrRef 解决方案
     */
    public String getEncryptErrRef() {
        return this.EncryptErrRef;
    }

    /**
     * Set 解决方案
     * @param EncryptErrRef 解决方案
     */
    public void setEncryptErrRef(String EncryptErrRef) {
        this.EncryptErrRef = EncryptErrRef;
    }

    /**
     * Get 任务创建时间 
     * @return CreatTime 任务创建时间
     */
    public String getCreatTime() {
        return this.CreatTime;
    }

    /**
     * Set 任务创建时间
     * @param CreatTime 任务创建时间
     */
    public void setCreatTime(String CreatTime) {
        this.CreatTime = CreatTime;
    }

    /**
     * Get 任务开始处理时间 
     * @return StartTime 任务开始处理时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始处理时间
     * @param StartTime 任务开始处理时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务处理结束时间 
     * @return EndTime 任务处理结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务处理结束时间
     * @param EndTime 任务处理结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 加固耗时（秒单位） 
     * @return CostTime 加固耗时（秒单位）
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 加固耗时（秒单位）
     * @param CostTime 加固耗时（秒单位）
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 在线加固成功下载包 
     * @return EncryptPkgUrl 在线加固成功下载包
     */
    public String getEncryptPkgUrl() {
        return this.EncryptPkgUrl;
    }

    /**
     * Set 在线加固成功下载包
     * @param EncryptPkgUrl 在线加固成功下载包
     */
    public void setEncryptPkgUrl(String EncryptPkgUrl) {
        this.EncryptPkgUrl = EncryptPkgUrl;
    }

    /**
     * Get 本次加固配置 
     * @return AppletInfo 本次加固配置
     */
    public AppletInfo getAppletInfo() {
        return this.AppletInfo;
    }

    /**
     * Set 本次加固配置
     * @param AppletInfo 本次加固配置
     */
    public void setAppletInfo(AppletInfo AppletInfo) {
        this.AppletInfo = AppletInfo;
    }

    public AppletResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppletResult(AppletResult source) {
        if (source.ResultId != null) {
            this.ResultId = new String(source.ResultId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.OpUin != null) {
            this.OpUin = new Long(source.OpUin);
        }
        if (source.EncryptState != null) {
            this.EncryptState = new Long(source.EncryptState);
        }
        if (source.EncryptStateDesc != null) {
            this.EncryptStateDesc = new String(source.EncryptStateDesc);
        }
        if (source.EncryptErrCode != null) {
            this.EncryptErrCode = new Long(source.EncryptErrCode);
        }
        if (source.EncryptErrDesc != null) {
            this.EncryptErrDesc = new String(source.EncryptErrDesc);
        }
        if (source.EncryptErrRef != null) {
            this.EncryptErrRef = new String(source.EncryptErrRef);
        }
        if (source.CreatTime != null) {
            this.CreatTime = new String(source.CreatTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.EncryptPkgUrl != null) {
            this.EncryptPkgUrl = new String(source.EncryptPkgUrl);
        }
        if (source.AppletInfo != null) {
            this.AppletInfo = new AppletInfo(source.AppletInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "OpUin", this.OpUin);
        this.setParamSimple(map, prefix + "EncryptState", this.EncryptState);
        this.setParamSimple(map, prefix + "EncryptStateDesc", this.EncryptStateDesc);
        this.setParamSimple(map, prefix + "EncryptErrCode", this.EncryptErrCode);
        this.setParamSimple(map, prefix + "EncryptErrDesc", this.EncryptErrDesc);
        this.setParamSimple(map, prefix + "EncryptErrRef", this.EncryptErrRef);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "EncryptPkgUrl", this.EncryptPkgUrl);
        this.setParamObj(map, prefix + "AppletInfo.", this.AppletInfo);

    }
}

