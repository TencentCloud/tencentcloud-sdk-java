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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayoutParams extends AbstractModel{

    /**
    * 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板
    */
    @SerializedName("Template")
    @Expose
    private Long Template;

    /**
    * 屏幕分享模板中有效，代表左侧大画面对应的用户ID
    */
    @SerializedName("MainVideoUserId")
    @Expose
    private String MainVideoUserId;

    /**
    * 屏幕分享模板中有效，代表左侧大画面对应的流类型，0为摄像头，1为屏幕分享
    */
    @SerializedName("MainVideoStreamType")
    @Expose
    private Long MainVideoStreamType;

    /**
     * Get 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板 
     * @return Template 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板
     */
    public Long getTemplate() {
        return this.Template;
    }

    /**
     * Set 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板
     * @param Template 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板
     */
    public void setTemplate(Long Template) {
        this.Template = Template;
    }

    /**
     * Get 屏幕分享模板中有效，代表左侧大画面对应的用户ID 
     * @return MainVideoUserId 屏幕分享模板中有效，代表左侧大画面对应的用户ID
     */
    public String getMainVideoUserId() {
        return this.MainVideoUserId;
    }

    /**
     * Set 屏幕分享模板中有效，代表左侧大画面对应的用户ID
     * @param MainVideoUserId 屏幕分享模板中有效，代表左侧大画面对应的用户ID
     */
    public void setMainVideoUserId(String MainVideoUserId) {
        this.MainVideoUserId = MainVideoUserId;
    }

    /**
     * Get 屏幕分享模板中有效，代表左侧大画面对应的流类型，0为摄像头，1为屏幕分享 
     * @return MainVideoStreamType 屏幕分享模板中有效，代表左侧大画面对应的流类型，0为摄像头，1为屏幕分享
     */
    public Long getMainVideoStreamType() {
        return this.MainVideoStreamType;
    }

    /**
     * Set 屏幕分享模板中有效，代表左侧大画面对应的流类型，0为摄像头，1为屏幕分享
     * @param MainVideoStreamType 屏幕分享模板中有效，代表左侧大画面对应的流类型，0为摄像头，1为屏幕分享
     */
    public void setMainVideoStreamType(Long MainVideoStreamType) {
        this.MainVideoStreamType = MainVideoStreamType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamSimple(map, prefix + "MainVideoUserId", this.MainVideoUserId);
        this.setParamSimple(map, prefix + "MainVideoStreamType", this.MainVideoStreamType);

    }
}

