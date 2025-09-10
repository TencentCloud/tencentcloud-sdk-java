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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MiniAppCreateFlowOption extends AbstractModel {

    /**
    * 到期提醒日（linux时间戳） 精确到天
    */
    @SerializedName("RemindedOn")
    @Expose
    private Long RemindedOn;

    /**
    * 是否需要发起前进行审批
    */
    @SerializedName("NeedCreateReview")
    @Expose
    private Boolean NeedCreateReview;

    /**
    * 在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:![FlowDisplayType](https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png)
    */
    @SerializedName("FlowDisplayType")
    @Expose
    private Long FlowDisplayType;

    /**
    * 小程序集成发起，是否禁止发起时修改合同内容
<ul>
<li>false：默认值，不禁止发起时修改合同内容</li>
<li>true：禁止发起时修改合同内容</li>
</ul>
    */
    @SerializedName("ForbidEditFlow")
    @Expose
    private Boolean ForbidEditFlow;

    /**
     * Get 到期提醒日（linux时间戳） 精确到天 
     * @return RemindedOn 到期提醒日（linux时间戳） 精确到天
     */
    public Long getRemindedOn() {
        return this.RemindedOn;
    }

    /**
     * Set 到期提醒日（linux时间戳） 精确到天
     * @param RemindedOn 到期提醒日（linux时间戳） 精确到天
     */
    public void setRemindedOn(Long RemindedOn) {
        this.RemindedOn = RemindedOn;
    }

    /**
     * Get 是否需要发起前进行审批 
     * @return NeedCreateReview 是否需要发起前进行审批
     */
    public Boolean getNeedCreateReview() {
        return this.NeedCreateReview;
    }

    /**
     * Set 是否需要发起前进行审批
     * @param NeedCreateReview 是否需要发起前进行审批
     */
    public void setNeedCreateReview(Boolean NeedCreateReview) {
        this.NeedCreateReview = NeedCreateReview;
    }

    /**
     * Get 在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:![FlowDisplayType](https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png) 
     * @return FlowDisplayType 在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:![FlowDisplayType](https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png)
     */
    public Long getFlowDisplayType() {
        return this.FlowDisplayType;
    }

    /**
     * Set 在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:![FlowDisplayType](https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png)
     * @param FlowDisplayType 在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:![FlowDisplayType](https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png)
     */
    public void setFlowDisplayType(Long FlowDisplayType) {
        this.FlowDisplayType = FlowDisplayType;
    }

    /**
     * Get 小程序集成发起，是否禁止发起时修改合同内容
<ul>
<li>false：默认值，不禁止发起时修改合同内容</li>
<li>true：禁止发起时修改合同内容</li>
</ul> 
     * @return ForbidEditFlow 小程序集成发起，是否禁止发起时修改合同内容
<ul>
<li>false：默认值，不禁止发起时修改合同内容</li>
<li>true：禁止发起时修改合同内容</li>
</ul>
     */
    public Boolean getForbidEditFlow() {
        return this.ForbidEditFlow;
    }

    /**
     * Set 小程序集成发起，是否禁止发起时修改合同内容
<ul>
<li>false：默认值，不禁止发起时修改合同内容</li>
<li>true：禁止发起时修改合同内容</li>
</ul>
     * @param ForbidEditFlow 小程序集成发起，是否禁止发起时修改合同内容
<ul>
<li>false：默认值，不禁止发起时修改合同内容</li>
<li>true：禁止发起时修改合同内容</li>
</ul>
     */
    public void setForbidEditFlow(Boolean ForbidEditFlow) {
        this.ForbidEditFlow = ForbidEditFlow;
    }

    public MiniAppCreateFlowOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MiniAppCreateFlowOption(MiniAppCreateFlowOption source) {
        if (source.RemindedOn != null) {
            this.RemindedOn = new Long(source.RemindedOn);
        }
        if (source.NeedCreateReview != null) {
            this.NeedCreateReview = new Boolean(source.NeedCreateReview);
        }
        if (source.FlowDisplayType != null) {
            this.FlowDisplayType = new Long(source.FlowDisplayType);
        }
        if (source.ForbidEditFlow != null) {
            this.ForbidEditFlow = new Boolean(source.ForbidEditFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemindedOn", this.RemindedOn);
        this.setParamSimple(map, prefix + "NeedCreateReview", this.NeedCreateReview);
        this.setParamSimple(map, prefix + "FlowDisplayType", this.FlowDisplayType);
        this.setParamSimple(map, prefix + "ForbidEditFlow", this.ForbidEditFlow);

    }
}

