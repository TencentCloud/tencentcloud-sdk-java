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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceDetailAttributesInfo extends AbstractModel{

    /**
    * 年龄 [0,65]，其中65代表“65岁及以上”。 
FaceAttributesType 不为含Age 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 美丑打分[0,100]。 
FaceAttributesType 不含 Beauty 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Beauty")
    @Expose
    private Long Beauty;

    /**
    * 情绪，可识别自然、高兴、惊讶、生气、悲伤、厌恶、害怕。 
AttributeItem对应的Type为 —— 0：自然，1：高兴，2：惊讶，3：生气，4：悲伤，5：厌恶，6：害怕
FaceAttributesType 不含Emotion 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Emotion")
    @Expose
    private AttributeItem Emotion;

    /**
    * 眼睛相关信息，可识别是否戴眼镜、是否闭眼、是否双眼皮和眼睛大小。 
FaceAttributesType 不含Eye 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Eye")
    @Expose
    private Eye Eye;

    /**
    * 眉毛相关信息，可识别眉毛浓密、弯曲、长短信息。 
FaceAttributesType 不含Eyebrow 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Eyebrow")
    @Expose
    private Eyebrow Eyebrow;

    /**
    * 性别信息。 
AttributeItem对应的Type为 —— 	0：男性，1：女性。
FaceAttributesType 不含Gender 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Gender")
    @Expose
    private AttributeItem Gender;

    /**
    * 头发信息，包含头发长度、有无刘海、头发颜色。 
FaceAttributesType 不含Hair 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Hair")
    @Expose
    private Hair Hair;

    /**
    * 帽子信息，可识别是否佩戴帽子、帽子款式、帽子颜色。 
FaceAttributesType 不含Hat 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Hat")
    @Expose
    private Hat Hat;

    /**
    * 姿态信息，包含人脸的上下偏移、左右偏移、平面旋转信息。 
FaceAttributesType 不含Headpose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("HeadPose")
    @Expose
    private HeadPose HeadPose;

    /**
    * 口罩佩戴信息。 
AttributeItem对应的Type为 —— 0: 无口罩， 1: 有口罩不遮脸，2: 有口罩遮下巴，3: 有口罩遮嘴，4: 正确佩戴口罩。
FaceAttributesType 不含Mask 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Mask")
    @Expose
    private AttributeItem Mask;

    /**
    * 嘴巴信息，可识别是否张嘴、嘴唇厚度。 
FaceAttributesType 不含 Mouth 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Mouth")
    @Expose
    private Mouth Mouth;

    /**
    * 胡子信息。
AttributeItem对应的Type为 —— 0：无胡子，1：有胡子。 
FaceAttributesType 不含 Moustache 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Moustache")
    @Expose
    private AttributeItem Moustache;

    /**
    * 鼻子信息。 
AttributeItem对应的Type为 —— 0：朝天鼻，1：鹰钩鼻，2：普通，3：圆鼻头
FaceAttributesType 不含 Nose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Nose")
    @Expose
    private AttributeItem Nose;

    /**
    * 脸型信息。 
AttributeItem对应的Type为 —— 0：方脸，1：三角脸，2：鹅蛋脸，3：心形脸，4：圆脸。
FaceAttributesType 不含 Shape 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Shape")
    @Expose
    private AttributeItem Shape;

    /**
    * 肤色信息。 
AttributeItem对应的Type为 —— 0：黄色皮肤，1：棕色皮肤，2：黑色皮肤，3：白色皮肤。
FaceAttributesType 不含 Skin 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Skin")
    @Expose
    private AttributeItem Skin;

    /**
    * 微笑程度，[0,100]。 
FaceAttributesType 不含 Smile 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
    */
    @SerializedName("Smile")
    @Expose
    private Long Smile;

    /**
     * Get 年龄 [0,65]，其中65代表“65岁及以上”。 
FaceAttributesType 不为含Age 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Age 年龄 [0,65]，其中65代表“65岁及以上”。 
FaceAttributesType 不为含Age 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 年龄 [0,65]，其中65代表“65岁及以上”。 
FaceAttributesType 不为含Age 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Age 年龄 [0,65]，其中65代表“65岁及以上”。 
FaceAttributesType 不为含Age 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 美丑打分[0,100]。 
FaceAttributesType 不含 Beauty 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Beauty 美丑打分[0,100]。 
FaceAttributesType 不含 Beauty 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Long getBeauty() {
        return this.Beauty;
    }

    /**
     * Set 美丑打分[0,100]。 
FaceAttributesType 不含 Beauty 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Beauty 美丑打分[0,100]。 
FaceAttributesType 不含 Beauty 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setBeauty(Long Beauty) {
        this.Beauty = Beauty;
    }

    /**
     * Get 情绪，可识别自然、高兴、惊讶、生气、悲伤、厌恶、害怕。 
AttributeItem对应的Type为 —— 0：自然，1：高兴，2：惊讶，3：生气，4：悲伤，5：厌恶，6：害怕
FaceAttributesType 不含Emotion 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Emotion 情绪，可识别自然、高兴、惊讶、生气、悲伤、厌恶、害怕。 
AttributeItem对应的Type为 —— 0：自然，1：高兴，2：惊讶，3：生气，4：悲伤，5：厌恶，6：害怕
FaceAttributesType 不含Emotion 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public AttributeItem getEmotion() {
        return this.Emotion;
    }

    /**
     * Set 情绪，可识别自然、高兴、惊讶、生气、悲伤、厌恶、害怕。 
AttributeItem对应的Type为 —— 0：自然，1：高兴，2：惊讶，3：生气，4：悲伤，5：厌恶，6：害怕
FaceAttributesType 不含Emotion 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Emotion 情绪，可识别自然、高兴、惊讶、生气、悲伤、厌恶、害怕。 
AttributeItem对应的Type为 —— 0：自然，1：高兴，2：惊讶，3：生气，4：悲伤，5：厌恶，6：害怕
FaceAttributesType 不含Emotion 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setEmotion(AttributeItem Emotion) {
        this.Emotion = Emotion;
    }

    /**
     * Get 眼睛相关信息，可识别是否戴眼镜、是否闭眼、是否双眼皮和眼睛大小。 
FaceAttributesType 不含Eye 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Eye 眼睛相关信息，可识别是否戴眼镜、是否闭眼、是否双眼皮和眼睛大小。 
FaceAttributesType 不含Eye 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Eye getEye() {
        return this.Eye;
    }

    /**
     * Set 眼睛相关信息，可识别是否戴眼镜、是否闭眼、是否双眼皮和眼睛大小。 
FaceAttributesType 不含Eye 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Eye 眼睛相关信息，可识别是否戴眼镜、是否闭眼、是否双眼皮和眼睛大小。 
FaceAttributesType 不含Eye 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setEye(Eye Eye) {
        this.Eye = Eye;
    }

    /**
     * Get 眉毛相关信息，可识别眉毛浓密、弯曲、长短信息。 
FaceAttributesType 不含Eyebrow 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Eyebrow 眉毛相关信息，可识别眉毛浓密、弯曲、长短信息。 
FaceAttributesType 不含Eyebrow 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Eyebrow getEyebrow() {
        return this.Eyebrow;
    }

    /**
     * Set 眉毛相关信息，可识别眉毛浓密、弯曲、长短信息。 
FaceAttributesType 不含Eyebrow 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Eyebrow 眉毛相关信息，可识别眉毛浓密、弯曲、长短信息。 
FaceAttributesType 不含Eyebrow 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setEyebrow(Eyebrow Eyebrow) {
        this.Eyebrow = Eyebrow;
    }

    /**
     * Get 性别信息。 
AttributeItem对应的Type为 —— 	0：男性，1：女性。
FaceAttributesType 不含Gender 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Gender 性别信息。 
AttributeItem对应的Type为 —— 	0：男性，1：女性。
FaceAttributesType 不含Gender 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public AttributeItem getGender() {
        return this.Gender;
    }

    /**
     * Set 性别信息。 
AttributeItem对应的Type为 —— 	0：男性，1：女性。
FaceAttributesType 不含Gender 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Gender 性别信息。 
AttributeItem对应的Type为 —— 	0：男性，1：女性。
FaceAttributesType 不含Gender 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setGender(AttributeItem Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 头发信息，包含头发长度、有无刘海、头发颜色。 
FaceAttributesType 不含Hair 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Hair 头发信息，包含头发长度、有无刘海、头发颜色。 
FaceAttributesType 不含Hair 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Hair getHair() {
        return this.Hair;
    }

    /**
     * Set 头发信息，包含头发长度、有无刘海、头发颜色。 
FaceAttributesType 不含Hair 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Hair 头发信息，包含头发长度、有无刘海、头发颜色。 
FaceAttributesType 不含Hair 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setHair(Hair Hair) {
        this.Hair = Hair;
    }

    /**
     * Get 帽子信息，可识别是否佩戴帽子、帽子款式、帽子颜色。 
FaceAttributesType 不含Hat 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Hat 帽子信息，可识别是否佩戴帽子、帽子款式、帽子颜色。 
FaceAttributesType 不含Hat 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Hat getHat() {
        return this.Hat;
    }

    /**
     * Set 帽子信息，可识别是否佩戴帽子、帽子款式、帽子颜色。 
FaceAttributesType 不含Hat 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Hat 帽子信息，可识别是否佩戴帽子、帽子款式、帽子颜色。 
FaceAttributesType 不含Hat 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setHat(Hat Hat) {
        this.Hat = Hat;
    }

    /**
     * Get 姿态信息，包含人脸的上下偏移、左右偏移、平面旋转信息。 
FaceAttributesType 不含Headpose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return HeadPose 姿态信息，包含人脸的上下偏移、左右偏移、平面旋转信息。 
FaceAttributesType 不含Headpose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public HeadPose getHeadPose() {
        return this.HeadPose;
    }

    /**
     * Set 姿态信息，包含人脸的上下偏移、左右偏移、平面旋转信息。 
FaceAttributesType 不含Headpose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param HeadPose 姿态信息，包含人脸的上下偏移、左右偏移、平面旋转信息。 
FaceAttributesType 不含Headpose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setHeadPose(HeadPose HeadPose) {
        this.HeadPose = HeadPose;
    }

    /**
     * Get 口罩佩戴信息。 
AttributeItem对应的Type为 —— 0: 无口罩， 1: 有口罩不遮脸，2: 有口罩遮下巴，3: 有口罩遮嘴，4: 正确佩戴口罩。
FaceAttributesType 不含Mask 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Mask 口罩佩戴信息。 
AttributeItem对应的Type为 —— 0: 无口罩， 1: 有口罩不遮脸，2: 有口罩遮下巴，3: 有口罩遮嘴，4: 正确佩戴口罩。
FaceAttributesType 不含Mask 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public AttributeItem getMask() {
        return this.Mask;
    }

    /**
     * Set 口罩佩戴信息。 
AttributeItem对应的Type为 —— 0: 无口罩， 1: 有口罩不遮脸，2: 有口罩遮下巴，3: 有口罩遮嘴，4: 正确佩戴口罩。
FaceAttributesType 不含Mask 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Mask 口罩佩戴信息。 
AttributeItem对应的Type为 —— 0: 无口罩， 1: 有口罩不遮脸，2: 有口罩遮下巴，3: 有口罩遮嘴，4: 正确佩戴口罩。
FaceAttributesType 不含Mask 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setMask(AttributeItem Mask) {
        this.Mask = Mask;
    }

    /**
     * Get 嘴巴信息，可识别是否张嘴、嘴唇厚度。 
FaceAttributesType 不含 Mouth 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Mouth 嘴巴信息，可识别是否张嘴、嘴唇厚度。 
FaceAttributesType 不含 Mouth 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Mouth getMouth() {
        return this.Mouth;
    }

    /**
     * Set 嘴巴信息，可识别是否张嘴、嘴唇厚度。 
FaceAttributesType 不含 Mouth 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Mouth 嘴巴信息，可识别是否张嘴、嘴唇厚度。 
FaceAttributesType 不含 Mouth 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setMouth(Mouth Mouth) {
        this.Mouth = Mouth;
    }

    /**
     * Get 胡子信息。
AttributeItem对应的Type为 —— 0：无胡子，1：有胡子。 
FaceAttributesType 不含 Moustache 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Moustache 胡子信息。
AttributeItem对应的Type为 —— 0：无胡子，1：有胡子。 
FaceAttributesType 不含 Moustache 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public AttributeItem getMoustache() {
        return this.Moustache;
    }

    /**
     * Set 胡子信息。
AttributeItem对应的Type为 —— 0：无胡子，1：有胡子。 
FaceAttributesType 不含 Moustache 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Moustache 胡子信息。
AttributeItem对应的Type为 —— 0：无胡子，1：有胡子。 
FaceAttributesType 不含 Moustache 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setMoustache(AttributeItem Moustache) {
        this.Moustache = Moustache;
    }

    /**
     * Get 鼻子信息。 
AttributeItem对应的Type为 —— 0：朝天鼻，1：鹰钩鼻，2：普通，3：圆鼻头
FaceAttributesType 不含 Nose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Nose 鼻子信息。 
AttributeItem对应的Type为 —— 0：朝天鼻，1：鹰钩鼻，2：普通，3：圆鼻头
FaceAttributesType 不含 Nose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public AttributeItem getNose() {
        return this.Nose;
    }

    /**
     * Set 鼻子信息。 
AttributeItem对应的Type为 —— 0：朝天鼻，1：鹰钩鼻，2：普通，3：圆鼻头
FaceAttributesType 不含 Nose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Nose 鼻子信息。 
AttributeItem对应的Type为 —— 0：朝天鼻，1：鹰钩鼻，2：普通，3：圆鼻头
FaceAttributesType 不含 Nose 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setNose(AttributeItem Nose) {
        this.Nose = Nose;
    }

    /**
     * Get 脸型信息。 
AttributeItem对应的Type为 —— 0：方脸，1：三角脸，2：鹅蛋脸，3：心形脸，4：圆脸。
FaceAttributesType 不含 Shape 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Shape 脸型信息。 
AttributeItem对应的Type为 —— 0：方脸，1：三角脸，2：鹅蛋脸，3：心形脸，4：圆脸。
FaceAttributesType 不含 Shape 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public AttributeItem getShape() {
        return this.Shape;
    }

    /**
     * Set 脸型信息。 
AttributeItem对应的Type为 —— 0：方脸，1：三角脸，2：鹅蛋脸，3：心形脸，4：圆脸。
FaceAttributesType 不含 Shape 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Shape 脸型信息。 
AttributeItem对应的Type为 —— 0：方脸，1：三角脸，2：鹅蛋脸，3：心形脸，4：圆脸。
FaceAttributesType 不含 Shape 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setShape(AttributeItem Shape) {
        this.Shape = Shape;
    }

    /**
     * Get 肤色信息。 
AttributeItem对应的Type为 —— 0：黄色皮肤，1：棕色皮肤，2：黑色皮肤，3：白色皮肤。
FaceAttributesType 不含 Skin 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Skin 肤色信息。 
AttributeItem对应的Type为 —— 0：黄色皮肤，1：棕色皮肤，2：黑色皮肤，3：白色皮肤。
FaceAttributesType 不含 Skin 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public AttributeItem getSkin() {
        return this.Skin;
    }

    /**
     * Set 肤色信息。 
AttributeItem对应的Type为 —— 0：黄色皮肤，1：棕色皮肤，2：黑色皮肤，3：白色皮肤。
FaceAttributesType 不含 Skin 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Skin 肤色信息。 
AttributeItem对应的Type为 —— 0：黄色皮肤，1：棕色皮肤，2：黑色皮肤，3：白色皮肤。
FaceAttributesType 不含 Skin 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setSkin(AttributeItem Skin) {
        this.Skin = Skin;
    }

    /**
     * Get 微笑程度，[0,100]。 
FaceAttributesType 不含 Smile 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。 
     * @return Smile 微笑程度，[0,100]。 
FaceAttributesType 不含 Smile 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Long getSmile() {
        return this.Smile;
    }

    /**
     * Set 微笑程度，[0,100]。 
FaceAttributesType 不含 Smile 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * @param Smile 微笑程度，[0,100]。 
FaceAttributesType 不含 Smile 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setSmile(Long Smile) {
        this.Smile = Smile;
    }

    public FaceDetailAttributesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceDetailAttributesInfo(FaceDetailAttributesInfo source) {
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Beauty != null) {
            this.Beauty = new Long(source.Beauty);
        }
        if (source.Emotion != null) {
            this.Emotion = new AttributeItem(source.Emotion);
        }
        if (source.Eye != null) {
            this.Eye = new Eye(source.Eye);
        }
        if (source.Eyebrow != null) {
            this.Eyebrow = new Eyebrow(source.Eyebrow);
        }
        if (source.Gender != null) {
            this.Gender = new AttributeItem(source.Gender);
        }
        if (source.Hair != null) {
            this.Hair = new Hair(source.Hair);
        }
        if (source.Hat != null) {
            this.Hat = new Hat(source.Hat);
        }
        if (source.HeadPose != null) {
            this.HeadPose = new HeadPose(source.HeadPose);
        }
        if (source.Mask != null) {
            this.Mask = new AttributeItem(source.Mask);
        }
        if (source.Mouth != null) {
            this.Mouth = new Mouth(source.Mouth);
        }
        if (source.Moustache != null) {
            this.Moustache = new AttributeItem(source.Moustache);
        }
        if (source.Nose != null) {
            this.Nose = new AttributeItem(source.Nose);
        }
        if (source.Shape != null) {
            this.Shape = new AttributeItem(source.Shape);
        }
        if (source.Skin != null) {
            this.Skin = new AttributeItem(source.Skin);
        }
        if (source.Smile != null) {
            this.Smile = new Long(source.Smile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Beauty", this.Beauty);
        this.setParamObj(map, prefix + "Emotion.", this.Emotion);
        this.setParamObj(map, prefix + "Eye.", this.Eye);
        this.setParamObj(map, prefix + "Eyebrow.", this.Eyebrow);
        this.setParamObj(map, prefix + "Gender.", this.Gender);
        this.setParamObj(map, prefix + "Hair.", this.Hair);
        this.setParamObj(map, prefix + "Hat.", this.Hat);
        this.setParamObj(map, prefix + "HeadPose.", this.HeadPose);
        this.setParamObj(map, prefix + "Mask.", this.Mask);
        this.setParamObj(map, prefix + "Mouth.", this.Mouth);
        this.setParamObj(map, prefix + "Moustache.", this.Moustache);
        this.setParamObj(map, prefix + "Nose.", this.Nose);
        this.setParamObj(map, prefix + "Shape.", this.Shape);
        this.setParamObj(map, prefix + "Skin.", this.Skin);
        this.setParamSimple(map, prefix + "Smile", this.Smile);

    }
}

