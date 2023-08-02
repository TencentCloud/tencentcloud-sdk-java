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

public class AndroidResult extends AbstractModel{

    /**
    * 结果Id,用于查询加固结果
    */
    @SerializedName("ResultId")
    @Expose
    private String ResultId;

    /**
    * 与当前任务关联的订单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 与当前任务关联的资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 本次任务发起者
    */
    @SerializedName("OpUin")
    @Expose
    private Long OpUin;

    /**
    * 应用类型：android-apk; android-aab;
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 应用包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * 后台资源绑定的包名
    */
    @SerializedName("BindAppPkgName")
    @Expose
    private String BindAppPkgName;

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
    * 加固失败错误码
    */
    @SerializedName("EncryptErrCode")
    @Expose
    private Long EncryptErrCode;

    /**
    * 加固失败原因
    */
    @SerializedName("EncryptErrDesc")
    @Expose
    private String EncryptErrDesc;

    /**
    * 加固失败解决方案
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
    * 在线加固-android应用原包下载链接
    */
    @SerializedName("AppUrl")
    @Expose
    private String AppUrl;

    /**
    * 在线加固-android应用文件MD5算法值
    */
    @SerializedName("AppMd5")
    @Expose
    private String AppMd5;

    /**
    * 在线加固-android应用应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 在线加固-android应用版本；
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 在线加固-android应用大小
    */
    @SerializedName("AppSize")
    @Expose
    private Long AppSize;

    /**
    * 在线加固-android加固-腾讯云应用加固工具版本
    */
    @SerializedName("OnlineToolVersion")
    @Expose
    private String OnlineToolVersion;

    /**
    * 在线加固-android加固，加固成功后文件md5算法值
    */
    @SerializedName("EncryptAppMd5")
    @Expose
    private String EncryptAppMd5;

    /**
    * 在线加固-android加固，加固成功后应用大小
    */
    @SerializedName("EncryptAppSize")
    @Expose
    private Long EncryptAppSize;

    /**
    * 在线加固-android加固，加固包下载链接。
    */
    @SerializedName("EncryptPkgUrl")
    @Expose
    private String EncryptPkgUrl;

    /**
    * 输出工具-android加固-腾讯云输出工具版本
    */
    @SerializedName("OutputToolVersion")
    @Expose
    private String OutputToolVersion;

    /**
    * 输出工具-android加固-工具大小
    */
    @SerializedName("OutputToolSize")
    @Expose
    private Long OutputToolSize;

    /**
    * 输出工具-android加固-工具输出时间
    */
    @SerializedName("ToolOutputTime")
    @Expose
    private String ToolOutputTime;

    /**
    * 输出工具-android加固-工具到期时间
    */
    @SerializedName("ToolExpireTime")
    @Expose
    private String ToolExpireTime;

    /**
    * 输出工具-android加固-输出工具下载链接
    */
    @SerializedName("OutputToolUrl")
    @Expose
    private String OutputToolUrl;

    /**
    * 本次android加固策略信息
    */
    @SerializedName("AndroidPlan")
    @Expose
    private AndroidPlan AndroidPlan;

    /**
     * Get 结果Id,用于查询加固结果 
     * @return ResultId 结果Id,用于查询加固结果
     */
    public String getResultId() {
        return this.ResultId;
    }

    /**
     * Set 结果Id,用于查询加固结果
     * @param ResultId 结果Id,用于查询加固结果
     */
    public void setResultId(String ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get 与当前任务关联的订单id 
     * @return OrderId 与当前任务关联的订单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 与当前任务关联的订单id
     * @param OrderId 与当前任务关联的订单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 与当前任务关联的资源Id 
     * @return ResourceId 与当前任务关联的资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 与当前任务关联的资源Id
     * @param ResourceId 与当前任务关联的资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 本次任务发起者 
     * @return OpUin 本次任务发起者
     */
    public Long getOpUin() {
        return this.OpUin;
    }

    /**
     * Set 本次任务发起者
     * @param OpUin 本次任务发起者
     */
    public void setOpUin(Long OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * Get 应用类型：android-apk; android-aab; 
     * @return AppType 应用类型：android-apk; android-aab;
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型：android-apk; android-aab;
     * @param AppType 应用类型：android-apk; android-aab;
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 应用包名 
     * @return AppPkgName 应用包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set 应用包名
     * @param AppPkgName 应用包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * Get 后台资源绑定的包名 
     * @return BindAppPkgName 后台资源绑定的包名
     */
    public String getBindAppPkgName() {
        return this.BindAppPkgName;
    }

    /**
     * Set 后台资源绑定的包名
     * @param BindAppPkgName 后台资源绑定的包名
     */
    public void setBindAppPkgName(String BindAppPkgName) {
        this.BindAppPkgName = BindAppPkgName;
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
     * Get 加固失败错误码 
     * @return EncryptErrCode 加固失败错误码
     */
    public Long getEncryptErrCode() {
        return this.EncryptErrCode;
    }

    /**
     * Set 加固失败错误码
     * @param EncryptErrCode 加固失败错误码
     */
    public void setEncryptErrCode(Long EncryptErrCode) {
        this.EncryptErrCode = EncryptErrCode;
    }

    /**
     * Get 加固失败原因 
     * @return EncryptErrDesc 加固失败原因
     */
    public String getEncryptErrDesc() {
        return this.EncryptErrDesc;
    }

    /**
     * Set 加固失败原因
     * @param EncryptErrDesc 加固失败原因
     */
    public void setEncryptErrDesc(String EncryptErrDesc) {
        this.EncryptErrDesc = EncryptErrDesc;
    }

    /**
     * Get 加固失败解决方案 
     * @return EncryptErrRef 加固失败解决方案
     */
    public String getEncryptErrRef() {
        return this.EncryptErrRef;
    }

    /**
     * Set 加固失败解决方案
     * @param EncryptErrRef 加固失败解决方案
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
     * Get 在线加固-android应用原包下载链接 
     * @return AppUrl 在线加固-android应用原包下载链接
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * Set 在线加固-android应用原包下载链接
     * @param AppUrl 在线加固-android应用原包下载链接
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * Get 在线加固-android应用文件MD5算法值 
     * @return AppMd5 在线加固-android应用文件MD5算法值
     */
    public String getAppMd5() {
        return this.AppMd5;
    }

    /**
     * Set 在线加固-android应用文件MD5算法值
     * @param AppMd5 在线加固-android应用文件MD5算法值
     */
    public void setAppMd5(String AppMd5) {
        this.AppMd5 = AppMd5;
    }

    /**
     * Get 在线加固-android应用应用名称 
     * @return AppName 在线加固-android应用应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 在线加固-android应用应用名称
     * @param AppName 在线加固-android应用应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 在线加固-android应用版本； 
     * @return AppVersion 在线加固-android应用版本；
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 在线加固-android应用版本；
     * @param AppVersion 在线加固-android应用版本；
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 在线加固-android应用大小 
     * @return AppSize 在线加固-android应用大小
     */
    public Long getAppSize() {
        return this.AppSize;
    }

    /**
     * Set 在线加固-android应用大小
     * @param AppSize 在线加固-android应用大小
     */
    public void setAppSize(Long AppSize) {
        this.AppSize = AppSize;
    }

    /**
     * Get 在线加固-android加固-腾讯云应用加固工具版本 
     * @return OnlineToolVersion 在线加固-android加固-腾讯云应用加固工具版本
     */
    public String getOnlineToolVersion() {
        return this.OnlineToolVersion;
    }

    /**
     * Set 在线加固-android加固-腾讯云应用加固工具版本
     * @param OnlineToolVersion 在线加固-android加固-腾讯云应用加固工具版本
     */
    public void setOnlineToolVersion(String OnlineToolVersion) {
        this.OnlineToolVersion = OnlineToolVersion;
    }

    /**
     * Get 在线加固-android加固，加固成功后文件md5算法值 
     * @return EncryptAppMd5 在线加固-android加固，加固成功后文件md5算法值
     */
    public String getEncryptAppMd5() {
        return this.EncryptAppMd5;
    }

    /**
     * Set 在线加固-android加固，加固成功后文件md5算法值
     * @param EncryptAppMd5 在线加固-android加固，加固成功后文件md5算法值
     */
    public void setEncryptAppMd5(String EncryptAppMd5) {
        this.EncryptAppMd5 = EncryptAppMd5;
    }

    /**
     * Get 在线加固-android加固，加固成功后应用大小 
     * @return EncryptAppSize 在线加固-android加固，加固成功后应用大小
     */
    public Long getEncryptAppSize() {
        return this.EncryptAppSize;
    }

    /**
     * Set 在线加固-android加固，加固成功后应用大小
     * @param EncryptAppSize 在线加固-android加固，加固成功后应用大小
     */
    public void setEncryptAppSize(Long EncryptAppSize) {
        this.EncryptAppSize = EncryptAppSize;
    }

    /**
     * Get 在线加固-android加固，加固包下载链接。 
     * @return EncryptPkgUrl 在线加固-android加固，加固包下载链接。
     */
    public String getEncryptPkgUrl() {
        return this.EncryptPkgUrl;
    }

    /**
     * Set 在线加固-android加固，加固包下载链接。
     * @param EncryptPkgUrl 在线加固-android加固，加固包下载链接。
     */
    public void setEncryptPkgUrl(String EncryptPkgUrl) {
        this.EncryptPkgUrl = EncryptPkgUrl;
    }

    /**
     * Get 输出工具-android加固-腾讯云输出工具版本 
     * @return OutputToolVersion 输出工具-android加固-腾讯云输出工具版本
     */
    public String getOutputToolVersion() {
        return this.OutputToolVersion;
    }

    /**
     * Set 输出工具-android加固-腾讯云输出工具版本
     * @param OutputToolVersion 输出工具-android加固-腾讯云输出工具版本
     */
    public void setOutputToolVersion(String OutputToolVersion) {
        this.OutputToolVersion = OutputToolVersion;
    }

    /**
     * Get 输出工具-android加固-工具大小 
     * @return OutputToolSize 输出工具-android加固-工具大小
     */
    public Long getOutputToolSize() {
        return this.OutputToolSize;
    }

    /**
     * Set 输出工具-android加固-工具大小
     * @param OutputToolSize 输出工具-android加固-工具大小
     */
    public void setOutputToolSize(Long OutputToolSize) {
        this.OutputToolSize = OutputToolSize;
    }

    /**
     * Get 输出工具-android加固-工具输出时间 
     * @return ToolOutputTime 输出工具-android加固-工具输出时间
     */
    public String getToolOutputTime() {
        return this.ToolOutputTime;
    }

    /**
     * Set 输出工具-android加固-工具输出时间
     * @param ToolOutputTime 输出工具-android加固-工具输出时间
     */
    public void setToolOutputTime(String ToolOutputTime) {
        this.ToolOutputTime = ToolOutputTime;
    }

    /**
     * Get 输出工具-android加固-工具到期时间 
     * @return ToolExpireTime 输出工具-android加固-工具到期时间
     */
    public String getToolExpireTime() {
        return this.ToolExpireTime;
    }

    /**
     * Set 输出工具-android加固-工具到期时间
     * @param ToolExpireTime 输出工具-android加固-工具到期时间
     */
    public void setToolExpireTime(String ToolExpireTime) {
        this.ToolExpireTime = ToolExpireTime;
    }

    /**
     * Get 输出工具-android加固-输出工具下载链接 
     * @return OutputToolUrl 输出工具-android加固-输出工具下载链接
     */
    public String getOutputToolUrl() {
        return this.OutputToolUrl;
    }

    /**
     * Set 输出工具-android加固-输出工具下载链接
     * @param OutputToolUrl 输出工具-android加固-输出工具下载链接
     */
    public void setOutputToolUrl(String OutputToolUrl) {
        this.OutputToolUrl = OutputToolUrl;
    }

    /**
     * Get 本次android加固策略信息 
     * @return AndroidPlan 本次android加固策略信息
     */
    public AndroidPlan getAndroidPlan() {
        return this.AndroidPlan;
    }

    /**
     * Set 本次android加固策略信息
     * @param AndroidPlan 本次android加固策略信息
     */
    public void setAndroidPlan(AndroidPlan AndroidPlan) {
        this.AndroidPlan = AndroidPlan;
    }

    public AndroidResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidResult(AndroidResult source) {
        if (source.ResultId != null) {
            this.ResultId = new String(source.ResultId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.OpUin != null) {
            this.OpUin = new Long(source.OpUin);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
        if (source.BindAppPkgName != null) {
            this.BindAppPkgName = new String(source.BindAppPkgName);
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
        if (source.AppUrl != null) {
            this.AppUrl = new String(source.AppUrl);
        }
        if (source.AppMd5 != null) {
            this.AppMd5 = new String(source.AppMd5);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.AppSize != null) {
            this.AppSize = new Long(source.AppSize);
        }
        if (source.OnlineToolVersion != null) {
            this.OnlineToolVersion = new String(source.OnlineToolVersion);
        }
        if (source.EncryptAppMd5 != null) {
            this.EncryptAppMd5 = new String(source.EncryptAppMd5);
        }
        if (source.EncryptAppSize != null) {
            this.EncryptAppSize = new Long(source.EncryptAppSize);
        }
        if (source.EncryptPkgUrl != null) {
            this.EncryptPkgUrl = new String(source.EncryptPkgUrl);
        }
        if (source.OutputToolVersion != null) {
            this.OutputToolVersion = new String(source.OutputToolVersion);
        }
        if (source.OutputToolSize != null) {
            this.OutputToolSize = new Long(source.OutputToolSize);
        }
        if (source.ToolOutputTime != null) {
            this.ToolOutputTime = new String(source.ToolOutputTime);
        }
        if (source.ToolExpireTime != null) {
            this.ToolExpireTime = new String(source.ToolExpireTime);
        }
        if (source.OutputToolUrl != null) {
            this.OutputToolUrl = new String(source.OutputToolUrl);
        }
        if (source.AndroidPlan != null) {
            this.AndroidPlan = new AndroidPlan(source.AndroidPlan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "OpUin", this.OpUin);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "BindAppPkgName", this.BindAppPkgName);
        this.setParamSimple(map, prefix + "EncryptState", this.EncryptState);
        this.setParamSimple(map, prefix + "EncryptStateDesc", this.EncryptStateDesc);
        this.setParamSimple(map, prefix + "EncryptErrCode", this.EncryptErrCode);
        this.setParamSimple(map, prefix + "EncryptErrDesc", this.EncryptErrDesc);
        this.setParamSimple(map, prefix + "EncryptErrRef", this.EncryptErrRef);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "AppUrl", this.AppUrl);
        this.setParamSimple(map, prefix + "AppMd5", this.AppMd5);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppSize", this.AppSize);
        this.setParamSimple(map, prefix + "OnlineToolVersion", this.OnlineToolVersion);
        this.setParamSimple(map, prefix + "EncryptAppMd5", this.EncryptAppMd5);
        this.setParamSimple(map, prefix + "EncryptAppSize", this.EncryptAppSize);
        this.setParamSimple(map, prefix + "EncryptPkgUrl", this.EncryptPkgUrl);
        this.setParamSimple(map, prefix + "OutputToolVersion", this.OutputToolVersion);
        this.setParamSimple(map, prefix + "OutputToolSize", this.OutputToolSize);
        this.setParamSimple(map, prefix + "ToolOutputTime", this.ToolOutputTime);
        this.setParamSimple(map, prefix + "ToolExpireTime", this.ToolExpireTime);
        this.setParamSimple(map, prefix + "OutputToolUrl", this.OutputToolUrl);
        this.setParamObj(map, prefix + "AndroidPlan.", this.AndroidPlan);

    }
}

