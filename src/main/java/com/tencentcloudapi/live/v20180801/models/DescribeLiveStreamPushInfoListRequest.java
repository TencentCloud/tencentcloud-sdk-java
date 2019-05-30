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

public class DescribeLiveStreamPushInfoListRequest  extends AbstractModel{

    /**
    * 推流域名。
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为live。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 页数，
范围[1,10000]，
默认值：1。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页个数，
范围：[1,1000]，
默认值： 200。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 获取推流域名。
     * @return PushDomain 推流域名。
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * 设置推流域名。
     * @param PushDomain 推流域名。
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * 获取推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为live。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取页数，
范围[1,10000]，
默认值：1。
     * @return PageNum 页数，
范围[1,10000]，
默认值：1。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置页数，
范围[1,10000]，
默认值：1。
     * @param PageNum 页数，
范围[1,10000]，
默认值：1。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页个数，
范围：[1,1000]，
默认值： 200。
     * @return PageSize 每页个数，
范围：[1,1000]，
默认值： 200。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页个数，
范围：[1,1000]，
默认值： 200。
     * @param PageSize 每页个数，
范围：[1,1000]，
默认值： 200。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

