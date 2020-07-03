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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCommonMixStreamRequest extends AbstractModel{

    /**
    * 混流会话（申请混流开始到取消混流结束）标识 ID。
    */
    @SerializedName("MixStreamSessionId")
    @Expose
    private String MixStreamSessionId;

    /**
    * 混流输入流列表。
    */
    @SerializedName("InputStreamList")
    @Expose
    private CommonMixInputParam [] InputStreamList;

    /**
    * 混流输出流参数。
    */
    @SerializedName("OutputParams")
    @Expose
    private CommonMixOutputParams OutputParams;

    /**
    * 输入模板 ID，若设置该参数，将按默认模板布局输出，无需填入自定义位置参数。
不填默认为0。
两输入源支持10，20，30，40，50。
三输入源支持310，390，391。
四输入源支持410。
五输入源支持510，590。
六输入源支持610。
    */
    @SerializedName("MixStreamTemplateId")
    @Expose
    private Long MixStreamTemplateId;

    /**
    * 混流的特殊控制参数。如无特殊需求，无需填写。
    */
    @SerializedName("ControlParams")
    @Expose
    private CommonMixControlParams ControlParams;

    /**
     * Get 混流会话（申请混流开始到取消混流结束）标识 ID。 
     * @return MixStreamSessionId 混流会话（申请混流开始到取消混流结束）标识 ID。
     */
    public String getMixStreamSessionId() {
        return this.MixStreamSessionId;
    }

    /**
     * Set 混流会话（申请混流开始到取消混流结束）标识 ID。
     * @param MixStreamSessionId 混流会话（申请混流开始到取消混流结束）标识 ID。
     */
    public void setMixStreamSessionId(String MixStreamSessionId) {
        this.MixStreamSessionId = MixStreamSessionId;
    }

    /**
     * Get 混流输入流列表。 
     * @return InputStreamList 混流输入流列表。
     */
    public CommonMixInputParam [] getInputStreamList() {
        return this.InputStreamList;
    }

    /**
     * Set 混流输入流列表。
     * @param InputStreamList 混流输入流列表。
     */
    public void setInputStreamList(CommonMixInputParam [] InputStreamList) {
        this.InputStreamList = InputStreamList;
    }

    /**
     * Get 混流输出流参数。 
     * @return OutputParams 混流输出流参数。
     */
    public CommonMixOutputParams getOutputParams() {
        return this.OutputParams;
    }

    /**
     * Set 混流输出流参数。
     * @param OutputParams 混流输出流参数。
     */
    public void setOutputParams(CommonMixOutputParams OutputParams) {
        this.OutputParams = OutputParams;
    }

    /**
     * Get 输入模板 ID，若设置该参数，将按默认模板布局输出，无需填入自定义位置参数。
不填默认为0。
两输入源支持10，20，30，40，50。
三输入源支持310，390，391。
四输入源支持410。
五输入源支持510，590。
六输入源支持610。 
     * @return MixStreamTemplateId 输入模板 ID，若设置该参数，将按默认模板布局输出，无需填入自定义位置参数。
不填默认为0。
两输入源支持10，20，30，40，50。
三输入源支持310，390，391。
四输入源支持410。
五输入源支持510，590。
六输入源支持610。
     */
    public Long getMixStreamTemplateId() {
        return this.MixStreamTemplateId;
    }

    /**
     * Set 输入模板 ID，若设置该参数，将按默认模板布局输出，无需填入自定义位置参数。
不填默认为0。
两输入源支持10，20，30，40，50。
三输入源支持310，390，391。
四输入源支持410。
五输入源支持510，590。
六输入源支持610。
     * @param MixStreamTemplateId 输入模板 ID，若设置该参数，将按默认模板布局输出，无需填入自定义位置参数。
不填默认为0。
两输入源支持10，20，30，40，50。
三输入源支持310，390，391。
四输入源支持410。
五输入源支持510，590。
六输入源支持610。
     */
    public void setMixStreamTemplateId(Long MixStreamTemplateId) {
        this.MixStreamTemplateId = MixStreamTemplateId;
    }

    /**
     * Get 混流的特殊控制参数。如无特殊需求，无需填写。 
     * @return ControlParams 混流的特殊控制参数。如无特殊需求，无需填写。
     */
    public CommonMixControlParams getControlParams() {
        return this.ControlParams;
    }

    /**
     * Set 混流的特殊控制参数。如无特殊需求，无需填写。
     * @param ControlParams 混流的特殊控制参数。如无特殊需求，无需填写。
     */
    public void setControlParams(CommonMixControlParams ControlParams) {
        this.ControlParams = ControlParams;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MixStreamSessionId", this.MixStreamSessionId);
        this.setParamArrayObj(map, prefix + "InputStreamList.", this.InputStreamList);
        this.setParamObj(map, prefix + "OutputParams.", this.OutputParams);
        this.setParamSimple(map, prefix + "MixStreamTemplateId", this.MixStreamTemplateId);
        this.setParamObj(map, prefix + "ControlParams.", this.ControlParams);

    }
}

