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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailBehaviorConfigInput extends AbstractModel {

    /**
    * <p>必填，仅允许 input（仅输入）或 both（输入加输出），与控制台一致；不允许 output、空值或省略。送审包方向使用 request/response。</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * <p>必填，observe 只观察记录，block 执行命中阻断或符合条件的输出替换。不再自动补默认值。审核异常另由 FailureMode 处理。</p>
    */
    @SerializedName("HandleAction")
    @Expose
    private String HandleAction;

    /**
    * <p>必填整数，50～5000 毫秒，0 无效且不再代表默认值。控制台初始显示 500，但 API 调用方仍须传入。这是每次审核 HTTP 调用的超时，不是整个模型生成或 SSE 连接时长。</p>
    */
    @SerializedName("TimeoutMs")
    @Expose
    private Long TimeoutMs;

    /**
    * <p>必填，open 为异常时尝试放行（存在未审核内容放行风险），closed 为异常时拦截；不得省略或为空。不改变正常命中结论，open 不能绕过所有 Relay 安全或生命周期错误。</p>
    */
    @SerializedName("FailureMode")
    @Expose
    private String FailureMode;

    /**
     * Get <p>必填，仅允许 input（仅输入）或 both（输入加输出），与控制台一致；不允许 output、空值或省略。送审包方向使用 request/response。</p> 
     * @return Direction <p>必填，仅允许 input（仅输入）或 both（输入加输出），与控制台一致；不允许 output、空值或省略。送审包方向使用 request/response。</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>必填，仅允许 input（仅输入）或 both（输入加输出），与控制台一致；不允许 output、空值或省略。送审包方向使用 request/response。</p>
     * @param Direction <p>必填，仅允许 input（仅输入）或 both（输入加输出），与控制台一致；不允许 output、空值或省略。送审包方向使用 request/response。</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get <p>必填，observe 只观察记录，block 执行命中阻断或符合条件的输出替换。不再自动补默认值。审核异常另由 FailureMode 处理。</p> 
     * @return HandleAction <p>必填，observe 只观察记录，block 执行命中阻断或符合条件的输出替换。不再自动补默认值。审核异常另由 FailureMode 处理。</p>
     */
    public String getHandleAction() {
        return this.HandleAction;
    }

    /**
     * Set <p>必填，observe 只观察记录，block 执行命中阻断或符合条件的输出替换。不再自动补默认值。审核异常另由 FailureMode 处理。</p>
     * @param HandleAction <p>必填，observe 只观察记录，block 执行命中阻断或符合条件的输出替换。不再自动补默认值。审核异常另由 FailureMode 处理。</p>
     */
    public void setHandleAction(String HandleAction) {
        this.HandleAction = HandleAction;
    }

    /**
     * Get <p>必填整数，50～5000 毫秒，0 无效且不再代表默认值。控制台初始显示 500，但 API 调用方仍须传入。这是每次审核 HTTP 调用的超时，不是整个模型生成或 SSE 连接时长。</p> 
     * @return TimeoutMs <p>必填整数，50～5000 毫秒，0 无效且不再代表默认值。控制台初始显示 500，但 API 调用方仍须传入。这是每次审核 HTTP 调用的超时，不是整个模型生成或 SSE 连接时长。</p>
     */
    public Long getTimeoutMs() {
        return this.TimeoutMs;
    }

    /**
     * Set <p>必填整数，50～5000 毫秒，0 无效且不再代表默认值。控制台初始显示 500，但 API 调用方仍须传入。这是每次审核 HTTP 调用的超时，不是整个模型生成或 SSE 连接时长。</p>
     * @param TimeoutMs <p>必填整数，50～5000 毫秒，0 无效且不再代表默认值。控制台初始显示 500，但 API 调用方仍须传入。这是每次审核 HTTP 调用的超时，不是整个模型生成或 SSE 连接时长。</p>
     */
    public void setTimeoutMs(Long TimeoutMs) {
        this.TimeoutMs = TimeoutMs;
    }

    /**
     * Get <p>必填，open 为异常时尝试放行（存在未审核内容放行风险），closed 为异常时拦截；不得省略或为空。不改变正常命中结论，open 不能绕过所有 Relay 安全或生命周期错误。</p> 
     * @return FailureMode <p>必填，open 为异常时尝试放行（存在未审核内容放行风险），closed 为异常时拦截；不得省略或为空。不改变正常命中结论，open 不能绕过所有 Relay 安全或生命周期错误。</p>
     */
    public String getFailureMode() {
        return this.FailureMode;
    }

    /**
     * Set <p>必填，open 为异常时尝试放行（存在未审核内容放行风险），closed 为异常时拦截；不得省略或为空。不改变正常命中结论，open 不能绕过所有 Relay 安全或生命周期错误。</p>
     * @param FailureMode <p>必填，open 为异常时尝试放行（存在未审核内容放行风险），closed 为异常时拦截；不得省略或为空。不改变正常命中结论，open 不能绕过所有 Relay 安全或生命周期错误。</p>
     */
    public void setFailureMode(String FailureMode) {
        this.FailureMode = FailureMode;
    }

    public CustomGuardrailBehaviorConfigInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailBehaviorConfigInput(CustomGuardrailBehaviorConfigInput source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.HandleAction != null) {
            this.HandleAction = new String(source.HandleAction);
        }
        if (source.TimeoutMs != null) {
            this.TimeoutMs = new Long(source.TimeoutMs);
        }
        if (source.FailureMode != null) {
            this.FailureMode = new String(source.FailureMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "HandleAction", this.HandleAction);
        this.setParamSimple(map, prefix + "TimeoutMs", this.TimeoutMs);
        this.setParamSimple(map, prefix + "FailureMode", this.FailureMode);

    }
}

