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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockIgnoreListRequest extends AbstractModel{

    /**
    * 1拦截列表 2 忽略列表
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * IP、Domain二选一，不能同时为空
    */
    @SerializedName("IOC")
    @Expose
    private IocListData [] IOC;

    /**
    * 可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效
    */
    @SerializedName("IocAction")
    @Expose
    private String IocAction;

    /**
    * 时间格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 时间格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 1拦截列表 2 忽略列表 
     * @return RuleType 1拦截列表 2 忽略列表
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 1拦截列表 2 忽略列表
     * @param RuleType 1拦截列表 2 忽略列表
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get IP、Domain二选一，不能同时为空 
     * @return IOC IP、Domain二选一，不能同时为空
     */
    public IocListData [] getIOC() {
        return this.IOC;
    }

    /**
     * Set IP、Domain二选一，不能同时为空
     * @param IOC IP、Domain二选一，不能同时为空
     */
    public void setIOC(IocListData [] IOC) {
        this.IOC = IOC;
    }

    /**
     * Get 可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效 
     * @return IocAction 可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效
     */
    public String getIocAction() {
        return this.IocAction;
    }

    /**
     * Set 可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效
     * @param IocAction 可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效
     */
    public void setIocAction(String IocAction) {
        this.IocAction = IocAction;
    }

    /**
     * Get 时间格式：yyyy-MM-dd HH:mm:ss 
     * @return StartTime 时间格式：yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 时间格式：yyyy-MM-dd HH:mm:ss
     * @param StartTime 时间格式：yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 时间格式：yyyy-MM-dd HH:mm:ss 
     * @return EndTime 时间格式：yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 时间格式：yyyy-MM-dd HH:mm:ss
     * @param EndTime 时间格式：yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ModifyBlockIgnoreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlockIgnoreListRequest(ModifyBlockIgnoreListRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.IOC != null) {
            this.IOC = new IocListData[source.IOC.length];
            for (int i = 0; i < source.IOC.length; i++) {
                this.IOC[i] = new IocListData(source.IOC[i]);
            }
        }
        if (source.IocAction != null) {
            this.IocAction = new String(source.IocAction);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArrayObj(map, prefix + "IOC.", this.IOC);
        this.setParamSimple(map, prefix + "IocAction", this.IocAction);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

