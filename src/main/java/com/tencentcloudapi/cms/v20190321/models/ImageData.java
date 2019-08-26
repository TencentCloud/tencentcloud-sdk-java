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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageData  extends AbstractModel{

    /**
    * 是否恶意 0：正常 1：可疑
    */
    @SerializedName("EvilFlag")
    @Expose
    private Long EvilFlag;

    /**
    * 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
21000：综合
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 图片性感详情
    */
    @SerializedName("HotDetect")
    @Expose
    private ImageHotDetect HotDetect;

    /**
    * 图片违法详情
    */
    @SerializedName("IllegalDetect")
    @Expose
    private ImageIllegalDetect IllegalDetect;

    /**
    * 图片OCR详情
    */
    @SerializedName("OCRDetect")
    @Expose
    private OCRDetect OCRDetect;

    /**
    * 图片涉政详情
    */
    @SerializedName("PolityDetect")
    @Expose
    private ImagePolityDetect PolityDetect;

    /**
    * 图片涉黄详情
    */
    @SerializedName("PornDetect")
    @Expose
    private ImagePornDetect PornDetect;

    /**
    * 图片相似度详情
    */
    @SerializedName("Similar")
    @Expose
    private Similar Similar;

    /**
    * 图片暴恐详情
    */
    @SerializedName("TerrorDetect")
    @Expose
    private ImageTerrorDetect TerrorDetect;

    /**
     * 获取是否恶意 0：正常 1：可疑
     * @return EvilFlag 是否恶意 0：正常 1：可疑
     */
    public Long getEvilFlag() {
        return this.EvilFlag;
    }

    /**
     * 设置是否恶意 0：正常 1：可疑
     * @param EvilFlag 是否恶意 0：正常 1：可疑
     */
    public void setEvilFlag(Long EvilFlag) {
        this.EvilFlag = EvilFlag;
    }

    /**
     * 获取恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
21000：综合
     * @return EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
21000：综合
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * 设置恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
21000：综合
     * @param EvilType 恶意类型
100：正常 
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂 
20103：性感
24001：暴恐
21000：综合
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * 获取图片性感详情
     * @return HotDetect 图片性感详情
     */
    public ImageHotDetect getHotDetect() {
        return this.HotDetect;
    }

    /**
     * 设置图片性感详情
     * @param HotDetect 图片性感详情
     */
    public void setHotDetect(ImageHotDetect HotDetect) {
        this.HotDetect = HotDetect;
    }

    /**
     * 获取图片违法详情
     * @return IllegalDetect 图片违法详情
     */
    public ImageIllegalDetect getIllegalDetect() {
        return this.IllegalDetect;
    }

    /**
     * 设置图片违法详情
     * @param IllegalDetect 图片违法详情
     */
    public void setIllegalDetect(ImageIllegalDetect IllegalDetect) {
        this.IllegalDetect = IllegalDetect;
    }

    /**
     * 获取图片OCR详情
     * @return OCRDetect 图片OCR详情
     */
    public OCRDetect getOCRDetect() {
        return this.OCRDetect;
    }

    /**
     * 设置图片OCR详情
     * @param OCRDetect 图片OCR详情
     */
    public void setOCRDetect(OCRDetect OCRDetect) {
        this.OCRDetect = OCRDetect;
    }

    /**
     * 获取图片涉政详情
     * @return PolityDetect 图片涉政详情
     */
    public ImagePolityDetect getPolityDetect() {
        return this.PolityDetect;
    }

    /**
     * 设置图片涉政详情
     * @param PolityDetect 图片涉政详情
     */
    public void setPolityDetect(ImagePolityDetect PolityDetect) {
        this.PolityDetect = PolityDetect;
    }

    /**
     * 获取图片涉黄详情
     * @return PornDetect 图片涉黄详情
     */
    public ImagePornDetect getPornDetect() {
        return this.PornDetect;
    }

    /**
     * 设置图片涉黄详情
     * @param PornDetect 图片涉黄详情
     */
    public void setPornDetect(ImagePornDetect PornDetect) {
        this.PornDetect = PornDetect;
    }

    /**
     * 获取图片相似度详情
     * @return Similar 图片相似度详情
     */
    public Similar getSimilar() {
        return this.Similar;
    }

    /**
     * 设置图片相似度详情
     * @param Similar 图片相似度详情
     */
    public void setSimilar(Similar Similar) {
        this.Similar = Similar;
    }

    /**
     * 获取图片暴恐详情
     * @return TerrorDetect 图片暴恐详情
     */
    public ImageTerrorDetect getTerrorDetect() {
        return this.TerrorDetect;
    }

    /**
     * 设置图片暴恐详情
     * @param TerrorDetect 图片暴恐详情
     */
    public void setTerrorDetect(ImageTerrorDetect TerrorDetect) {
        this.TerrorDetect = TerrorDetect;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilFlag", this.EvilFlag);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamObj(map, prefix + "HotDetect.", this.HotDetect);
        this.setParamObj(map, prefix + "IllegalDetect.", this.IllegalDetect);
        this.setParamObj(map, prefix + "OCRDetect.", this.OCRDetect);
        this.setParamObj(map, prefix + "PolityDetect.", this.PolityDetect);
        this.setParamObj(map, prefix + "PornDetect.", this.PornDetect);
        this.setParamObj(map, prefix + "Similar.", this.Similar);
        this.setParamObj(map, prefix + "TerrorDetect.", this.TerrorDetect);

    }
}

