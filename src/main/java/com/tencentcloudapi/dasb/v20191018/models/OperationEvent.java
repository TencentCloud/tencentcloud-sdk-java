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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationEvent extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 操作时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 来源IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 操作类型
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 具体操作内容
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 操作结果，1-成功，2-失败
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 姓名 
     * @return RealName 姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
     * @param RealName 姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 操作时间 
     * @return Time 操作时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 操作时间
     * @param Time 操作时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 来源IP 
     * @return SourceIp 来源IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 来源IP
     * @param SourceIp 来源IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 操作类型 
     * @return Kind 操作类型
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 操作类型
     * @param Kind 操作类型
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 具体操作内容 
     * @return Operation 具体操作内容
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 具体操作内容
     * @param Operation 具体操作内容
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 操作结果，1-成功，2-失败 
     * @return Result 操作结果，1-成功，2-失败
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果，1-成功，2-失败
     * @param Result 操作结果，1-成功，2-失败
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public OperationEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationEvent(OperationEvent source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

