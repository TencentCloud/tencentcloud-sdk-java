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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockIgnoreListRequest extends AbstractModel {

    /**
    * <p>1封禁列表 2 放通列表</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>IP、Domain二选一（注：封禁列表，只能填写IP），不能同时为空</p>
    */
    @SerializedName("IOC")
    @Expose
    private IocListData [] IOC;

    /**
    * <p>可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效</p>
    */
    @SerializedName("IocAction")
    @Expose
    private String IocAction;

    /**
    * <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填，必须大于当前时间且大于StartTime</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>是否来自微信</p><p>取值范围：[0, 1]</p>
    */
    @SerializedName("IsFromWeChat")
    @Expose
    private Long IsFromWeChat;

    /**
     * Get <p>1封禁列表 2 放通列表</p> 
     * @return RuleType <p>1封禁列表 2 放通列表</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>1封禁列表 2 放通列表</p>
     * @param RuleType <p>1封禁列表 2 放通列表</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>IP、Domain二选一（注：封禁列表，只能填写IP），不能同时为空</p> 
     * @return IOC <p>IP、Domain二选一（注：封禁列表，只能填写IP），不能同时为空</p>
     */
    public IocListData [] getIOC() {
        return this.IOC;
    }

    /**
     * Set <p>IP、Domain二选一（注：封禁列表，只能填写IP），不能同时为空</p>
     * @param IOC <p>IP、Domain二选一（注：封禁列表，只能填写IP），不能同时为空</p>
     */
    public void setIOC(IocListData [] IOC) {
        this.IOC = IOC;
    }

    /**
     * Get <p>可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效</p> 
     * @return IocAction <p>可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效</p>
     */
    public String getIocAction() {
        return this.IocAction;
    }

    /**
     * Set <p>可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效</p>
     * @param IocAction <p>可选值：delete（删除）、edit（编辑）、add（添加）  其他值无效</p>
     */
    public void setIocAction(String IocAction) {
        this.IocAction = IocAction;
    }

    /**
     * Get <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填</p> 
     * @return StartTime <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填</p>
     * @param StartTime <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填，必须大于当前时间且大于StartTime</p> 
     * @return EndTime <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填，必须大于当前时间且大于StartTime</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填，必须大于当前时间且大于StartTime</p>
     * @param EndTime <p>时间格式：yyyy-MM-dd HH:mm:ss，IocAction 为edit或add时必填，必须大于当前时间且大于StartTime</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>是否来自微信</p><p>取值范围：[0, 1]</p> 
     * @return IsFromWeChat <p>是否来自微信</p><p>取值范围：[0, 1]</p>
     */
    public Long getIsFromWeChat() {
        return this.IsFromWeChat;
    }

    /**
     * Set <p>是否来自微信</p><p>取值范围：[0, 1]</p>
     * @param IsFromWeChat <p>是否来自微信</p><p>取值范围：[0, 1]</p>
     */
    public void setIsFromWeChat(Long IsFromWeChat) {
        this.IsFromWeChat = IsFromWeChat;
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
        if (source.IsFromWeChat != null) {
            this.IsFromWeChat = new Long(source.IsFromWeChat);
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
        this.setParamSimple(map, prefix + "IsFromWeChat", this.IsFromWeChat);

    }
}

