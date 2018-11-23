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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneInfo  extends AbstractModel{

    /**
    * 场景图
    */
    @SerializedName("ScenePictureURL")
    @Expose
    private String ScenePictureURL;

    /**
    * 抓拍头像左上角X坐标在场景图中的像素点位置
    */
    @SerializedName("HeadX")
    @Expose
    private Integer HeadX;

    /**
    * 抓拍头像左上角Y坐标在场景图中的像素点位置
    */
    @SerializedName("HeadY")
    @Expose
    private Integer HeadY;

    /**
    * 抓拍头像在场景图中占有的像素宽度
    */
    @SerializedName("HeadWidth")
    @Expose
    private Integer HeadWidth;

    /**
    * 抓拍头像在场景图中占有的像素高度
    */
    @SerializedName("HeadHeight")
    @Expose
    private Integer HeadHeight;

    /**
     * 获取场景图
     * @return ScenePictureURL 场景图
     */
    public String getScenePictureURL() {
        return this.ScenePictureURL;
    }

    /**
     * 设置场景图
     * @param ScenePictureURL 场景图
     */
    public void setScenePictureURL(String ScenePictureURL) {
        this.ScenePictureURL = ScenePictureURL;
    }

    /**
     * 获取抓拍头像左上角X坐标在场景图中的像素点位置
     * @return HeadX 抓拍头像左上角X坐标在场景图中的像素点位置
     */
    public Integer getHeadX() {
        return this.HeadX;
    }

    /**
     * 设置抓拍头像左上角X坐标在场景图中的像素点位置
     * @param HeadX 抓拍头像左上角X坐标在场景图中的像素点位置
     */
    public void setHeadX(Integer HeadX) {
        this.HeadX = HeadX;
    }

    /**
     * 获取抓拍头像左上角Y坐标在场景图中的像素点位置
     * @return HeadY 抓拍头像左上角Y坐标在场景图中的像素点位置
     */
    public Integer getHeadY() {
        return this.HeadY;
    }

    /**
     * 设置抓拍头像左上角Y坐标在场景图中的像素点位置
     * @param HeadY 抓拍头像左上角Y坐标在场景图中的像素点位置
     */
    public void setHeadY(Integer HeadY) {
        this.HeadY = HeadY;
    }

    /**
     * 获取抓拍头像在场景图中占有的像素宽度
     * @return HeadWidth 抓拍头像在场景图中占有的像素宽度
     */
    public Integer getHeadWidth() {
        return this.HeadWidth;
    }

    /**
     * 设置抓拍头像在场景图中占有的像素宽度
     * @param HeadWidth 抓拍头像在场景图中占有的像素宽度
     */
    public void setHeadWidth(Integer HeadWidth) {
        this.HeadWidth = HeadWidth;
    }

    /**
     * 获取抓拍头像在场景图中占有的像素高度
     * @return HeadHeight 抓拍头像在场景图中占有的像素高度
     */
    public Integer getHeadHeight() {
        return this.HeadHeight;
    }

    /**
     * 设置抓拍头像在场景图中占有的像素高度
     * @param HeadHeight 抓拍头像在场景图中占有的像素高度
     */
    public void setHeadHeight(Integer HeadHeight) {
        this.HeadHeight = HeadHeight;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScenePictureURL", this.ScenePictureURL);
        this.setParamSimple(map, prefix + "HeadX", this.HeadX);
        this.setParamSimple(map, prefix + "HeadY", this.HeadY);
        this.setParamSimple(map, prefix + "HeadWidth", this.HeadWidth);
        this.setParamSimple(map, prefix + "HeadHeight", this.HeadHeight);

    }
}

