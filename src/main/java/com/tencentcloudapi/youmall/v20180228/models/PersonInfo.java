package com.tencentcloudapi.youmall.v20180228.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class PersonInfo  extends AbstractModel{


    /**
    * 用户ID
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

    /**
    * 人脸图片，这里返回的是图片内容的Base64编码
    */
    @SerializedName("PersonPicture")
    @Expose
    private String PersonPicture;

    /**
    * 性别：0男1女
    */
    @SerializedName("Gender")
    @Expose
    private Integer Gender;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Integer Age;

    /**
    * 身份类型：0-普通顾客，1~10黑名单，11~20白名单，11店员
    */
    @SerializedName("PersonType")
    @Expose
    private Integer PersonType;

    /**
     * 获取用户ID
     * @return PersonId 用户ID
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置用户ID
     * @param PersonId 用户ID
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取人脸图片，这里返回的是图片内容的Base64编码
     * @return PersonPicture 人脸图片，这里返回的是图片内容的Base64编码
     */
    public String getPersonPicture() {
        return this.PersonPicture;
    }

    /**
     * 设置人脸图片，这里返回的是图片内容的Base64编码
     * @param PersonPicture 人脸图片，这里返回的是图片内容的Base64编码
     */
    public void setPersonPicture(String PersonPicture) {
        this.PersonPicture = PersonPicture;
    }

    /**
     * 获取性别：0男1女
     * @return Gender 性别：0男1女
     */
    public Integer getGender() {
        return this.Gender;
    }

    /**
     * 设置性别：0男1女
     * @param Gender 性别：0男1女
     */
    public void setGender(Integer Gender) {
        this.Gender = Gender;
    }

    /**
     * 获取年龄
     * @return Age 年龄
     */
    public Integer getAge() {
        return this.Age;
    }

    /**
     * 设置年龄
     * @param Age 年龄
     */
    public void setAge(Integer Age) {
        this.Age = Age;
    }

    /**
     * 获取身份类型：0-普通顾客，1~10黑名单，11~20白名单，11店员
     * @return PersonType 身份类型：0-普通顾客，1~10黑名单，11~20白名单，11店员
     */
    public Integer getPersonType() {
        return this.PersonType;
    }

    /**
     * 设置身份类型：0-普通顾客，1~10黑名单，11~20白名单，11店员
     * @param PersonType 身份类型：0-普通顾客，1~10黑名单，11~20白名单，11店员
     */
    public void setPersonType(Integer PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonPicture", this.PersonPicture);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);

    }
}

