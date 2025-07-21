package com.example.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items


@Preview(heightDp = 500)
@Composable
fun PreviewItem() {
    LazyColumn(content = {
        items(getCategoryLists()) { item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    })

}

@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier
            .padding(16.dp)
            .size(width = 250.dp, height = 80.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {

            Image(
                painter = painterResource(id = img),
                contentDescription = " ",
                modifier = Modifier
                    .size(60.dp)
                    .padding(end = 16.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin
        )
    }

}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryLists(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.man, "Programming", "Master the art of coding"))
    list.add(Category(R.drawable.man, "Mathematics", "Crack complex problems with ease"))
    list.add(Category(R.drawable.man, "English", "Enhance your speaking and writing"))
    list.add(Category(R.drawable.man, "Bangla Literature", "Explore Bengali classics and poetry"))
    list.add(Category(R.drawable.man, "Technology Trends", "Stay updated with tech innovations"))
    list.add(Category(R.drawable.man, "Android Development", "Build modern mobile apps"))
    list.add(Category(R.drawable.man, "Data Science", "Unlock power of data and analytics"))
    list.add(Category(R.drawable.man, "UI/UX Design", "Design beautiful user experiences"))
    list.add(Category(R.drawable.man, "Cybersecurity", "Protect data and digital assets"))
    list.add(Category(R.drawable.man, "AI & Machine Learning", "Shape the future with AI"))
    list.add(Category(R.drawable.man, "Cloud Computing", "Master AWS, Azure & Google Cloud"))
    list.add(Category(R.drawable.man, "Game Development", "Create fun and interactive games"))
    list.add(Category(R.drawable.man, "Ethical Hacking", "Learn how to think like a hacker"))
    list.add(Category(R.drawable.man, "Digital Marketing", "Promote brands in the digital world"))
    list.add(Category(R.drawable.man, "Graphic Design", "Express ideas through visuals"))
    list.add(Category(R.drawable.man, "Physics", "Understand the universe and its forces"))
    list.add(Category(R.drawable.man, "Chemistry", "Explore atoms, molecules, and reactions"))
    list.add(Category(R.drawable.man, "Biology", "Study life and living organisms"))
    list.add(Category(R.drawable.man, "Economics", "Analyze markets, trade, and finance"))
    list.add(Category(R.drawable.man, "History", "Travel back through time"))
    list.add(Category(R.drawable.man, "Geography", "Understand Earth's landscapes"))
    list.add(Category(R.drawable.man, "Photography", "Capture moments like a pro"))
    list.add(Category(R.drawable.man, "Entrepreneurship", "Turn your ideas into reality"))
    list.add(Category(R.drawable.man, "Public Speaking", "Boost your confidence and voice"))


    return list
}

