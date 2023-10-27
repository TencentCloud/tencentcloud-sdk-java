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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertCenterIsolateRequest extends AbstractModel {

    /**
    * 处置对象,资产列表
    */
    @SerializedName("HandleAssetList")
    @Expose
    private String [] HandleAssetList;

    /**
    * 处置时间
1  1天
7   7天
-2 永久
    */
    @SerializedName("HandleTime")
    @Expose
    private Long HandleTime;

    /**
    * 当前日志方向： 0 出向 1 入向
    */
    @SerializedName("AlertDirection")
    @Expose
    private Long AlertDirection;

    /**
    * 隔离类型 
1 互联网入站
2 互联网出站
4 内网访问
    */
    @SerializedName("IsolateType")
    @Expose
    private Long [] IsolateType;

    /**
    * 运维模式 1 IP白名单 2 身份认证
    */
    @SerializedName("OmMode")
    @Expose
    private Long OmMode;

    /**
     * Get 处置对象,资产列表 
     * @return HandleAssetList 处置对象,资产列表
     */
    public String [] getHandleAssetList() {
        return this.HandleAssetList;
    }

    /**
     * Set 处置对象,资产列表
     * @param HandleAssetList 处置对象,资产列表
     */
    public void setHandleAssetList(String [] HandleAssetList) {
        this.HandleAssetList = HandleAssetList;
    }

    /**
     * Get 处置时间
1  1天
7   7天
-2 永久 
     * @return HandleTime 处置时间
1  1天
7   7天
-2 永久
     */
    public Long getHandleTime() {
        return this.HandleTime;
    }

    /**
     * Set 处置时间
1  1天
7   7天
-2 永久
     * @param HandleTime 处置时间
1  1天
7   7天
-2 永久
     */
    public void setHandleTime(Long HandleTime) {
        this.HandleTime = HandleTime;
    }

    /**
     * Get 当前日志方向： 0 出向 1 入向 
     * @return AlertDirection 当前日志方向： 0 出向 1 入向
     */
    public Long getAlertDirection() {
        return this.AlertDirection;
    }

    /**
     * Set 当前日志方向： 0 出向 1 入向
     * @param AlertDirection 当前日志方向： 0 出向 1 入向
     */
    public void setAlertDirection(Long AlertDirection) {
        this.AlertDirection = AlertDirection;
    }

    /**
     * Get 隔离类型 
1 互联网入站
2 互联网出站
4 内网访问 
     * @return IsolateType 隔离类型 
1 互联网入站
2 互联网出站
4 内网访问
     */
    public Long [] getIsolateType() {
        return this.IsolateType;
    }

    /**
     * Set 隔离类型 
1 互联网入站
2 互联网出站
4 内网访问
     * @param IsolateType 隔离类型 
1 互联网入站
2 互联网出站
4 内网访问
     */
    public void setIsolateType(Long [] IsolateType) {
        this.IsolateType = IsolateType;
    }

    /**
     * Get 运维模式 1 IP白名单 2 身份认证 
     * @return OmMode 运维模式 1 IP白名单 2 身份认证
     */
    public Long getOmMode() {
        return this.OmMode;
    }

    /**
     * Set 运维模式 1 IP白名单 2 身份认证
     * @param OmMode 运维模式 1 IP白名单 2 身份认证
     */
    public void setOmMode(Long OmMode) {
        this.OmMode = OmMode;
    }

    public CreateAlertCenterIsolateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertCenterIsolateRequest(CreateAlertCenterIsolateRequest source) {
        if (source.HandleAssetList != null) {
            this.HandleAssetList = new String[source.HandleAssetList.length];
            for (int i = 0; i < source.HandleAssetList.length; i++) {
                this.HandleAssetList[i] = new String(source.HandleAssetList[i]);
            }
        }
        if (source.HandleTime != null) {
            this.HandleTime = new Long(source.HandleTime);
        }
        if (source.AlertDirection != null) {
            this.AlertDirection = new Long(source.AlertDirection);
        }
        if (source.IsolateType != null) {
            this.IsolateType = new Long[source.IsolateType.length];
            for (int i = 0; i < source.IsolateType.length; i++) {
                this.IsolateType[i] = new Long(source.IsolateType[i]);
            }
        }
        if (source.OmMode != null) {
            this.OmMode = new Long(source.OmMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HandleAssetList.", this.HandleAssetList);
        this.setParamSimple(map, prefix + "HandleTime", this.HandleTime);
        this.setParamSimple(map, prefix + "AlertDirection", this.AlertDirection);
        this.setParamArraySimple(map, prefix + "IsolateType.", this.IsolateType);
        this.setParamSimple(map, prefix + "OmMode", this.OmMode);

    }
}

